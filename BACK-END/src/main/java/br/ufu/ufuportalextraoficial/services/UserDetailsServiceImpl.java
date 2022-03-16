package br.ufu.ufuportalextraoficial.services;

import br.ufu.ufuportalextraoficial.models.User;
import br.ufu.ufuportalextraoficial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserDetailsServiceImpl implements UserDetailsService {
  
  @Autowired
  private UserRepository userRepository;
  
//  @Override
//  public UserDetails loadUserByUsername(String username)
//      throws UsernameNotFoundException {
//    User user = userRepository.getUserByUsername(username);
//
//    if (user == null) {
//      throw new UsernameNotFoundException("Could not find user");
//    }
//
//    return new MyUserDetails(user);
//  }
  @Override
  public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    User user = userRepository.getUserByUsername(userName);
    if (user == null) {
      throw new UsernameNotFoundException("userName" + userName + "Not found in the database");
    }

//    return new org.springframework.security.core.userdetails.User(user.getName(), new BCryptPasswordEncoder().encode(user.getPassword()), getGrantedAuth(user));
//    return new org.springframework.security.core.userdetails.User(user.getUsername(), new BCryptPasswordEncoder().encode(user.getPassword()), getGrantedAuth(user));
    user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
//    new BCryptPasswordEncoder().encode(user.getPassword());
    return new MyUserDetails(user);
  }

}
