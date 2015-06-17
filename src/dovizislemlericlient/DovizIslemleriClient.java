/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizislemlericlient;

import tr.gov.ptt.dovizislemlericlient.clients.DovizCeviriciWs;
import tr.gov.ptt.dovizislemlericlient.clients.DovizCeviriciWs_Service;

/**
 *
 * @author Administrator
 */
public class DovizIslemleriClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DovizCeviriciWs_Service service = new DovizCeviriciWs_Service();
        DovizCeviriciWs port = service.getDovizCeviriciWsPort();
        System.out.println("Sonuc :"+ port.dollarToTL(45));
        
    }
    
}
