package com.example;

import static com.example.PeerSingleton.getInstance;

public class Main {
  public static void main(String[] args) {
      PeerSingleton peerList01 = PeerSingleton.getInstance();
      PeerSingleton peerList02 = PeerSingleton.getInstance();
      
      for (String hostName: peerList01.getHostNames()){
          System.out.println("Host Name:    "+ hostName);
      }
      for (String hostName: peerList02.getHostNames()){
          System.out.println("Host Name:    "+ hostName);
      }
      
  }  
}
