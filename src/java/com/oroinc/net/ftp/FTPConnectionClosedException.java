/***
 * $Id: FTPConnectionClosedException.java,v 1.1 2002/04/03 01:04:29 brekke Exp $
 *
 * NetComponents Internet Protocol Library
 * Copyright (C) 1997-2002  Daniel F. Savarese
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library in the LICENSE file; if not, write
 * to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 ***/

package com.oroinc.net.ftp;

import java.io.*;

/***
 * FTPConnectionClosedException is used to indicate the premature or
 * unexpected closing of an FTP connection resulting from a 
 * <a href="com.oroinc.net.ftp.FTPReply.html#SERVICE_NOT_AVAILABLE">
 * FTPReply.SERVICE_NOT_AVAILABLE </a> response (FTP reply code 421) to a
 * failed FTP command.  This exception is derived from IOException and
 * therefore may be caught either as an IOException or specifically as an
 * FTPConnectionClosedException.
 * <p>
 * <p>
 * @author Daniel F. Savarese
 * @see FTP
 * @see FTPClient
 ***/

public class FTPConnectionClosedException extends IOException {

  /*** Constructs a FTPConnectionClosedException with no message ***/
  public FTPConnectionClosedException() {
    super();
  }

  /*** 
   * Constructs a FTPConnectionClosedException with a specified message.
   * <p>
   * @param message  The message explaining the reason for the exception.
   ***/
  public FTPConnectionClosedException(String message) {
    super(message);
  }

}