package day11_Switch_Scanner;

public class StatusCode {
    public static void main(String[] args) {
        /*HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status code:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable

         declare an int variable called StatusCode, write a switch that prints out, on a line
          by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok*/

        int code = 504;
        String status ="";

        switch (code){
            case 200:
                status = "OK";
                break;
            case 201:
                status= "Created";
                break;
            case 202:
                status= "Accepted";
                break;
            case 301:
                status="Moved Permanently";
                break;
            case 303:
                status="See Other";
                break;
            case 304:
                status="Not Modified";
                break;
            case 307:
                status="Temporary Redirect";
                break;
            case 400:
                status="Bad Request";
                break;
            case 401:
                status="Unauthorized";
                break;
            case 403:
                status="Forbidden";
                break;
            case 404:
                status="Not Found";
                break;
            case 410:
                status="Gone";
                break;
            case 500:
                status="Internal Server Error";
                break;
            case 503:
                status="Service Unavailable";

            default:
                status ="Invalid code";
        }
        System.out.println(status);

    }
}
