import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!loader")
public final class Applet_Sub2 extends Applet implements Runnable {

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt2831;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!qd;")
	private Class67 aClass67_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt2832;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean159;

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method1815(@OriginalArg(0) String arg0) {
		if (this.aBoolean159) {
			return;
		}
		this.aBoolean159 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;I)Z")
	private boolean method1816(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg1);
			local10.write(arg0, 0, arg0.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method1815("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ZI)[B")
	private byte[] method1817(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(4) Graphics local4 = this.getGraphics();
		@Pc(16) Font local16 = new Font("Helvetica", 1, 13);
		@Pc(20) FontMetrics local20 = this.getFontMetrics(local16);
		@Pc(25) Color local25 = new Color(9179409);
		@Pc(28) byte[] local28 = new byte[arg3];
		try {
			@Pc(38) InputStream local38;
			if (arg2) {
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(this.getCodeBase().getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
				local38 = local49.getInputStream();
			} else {
				local38 = (new URL(this.getCodeBase(), arg0)).openStream();
			}
			@Pc(76) int local76 = 0;
			@Pc(78) int local78 = -1;
			while (local76 < local28.length) {
				@Pc(92) int local92 = local28.length - local76;
				if (local92 > 1000) {
					local92 = 1000;
				}
				@Pc(103) int local103 = local38.read(local28, local76, local92);
				if (local103 < 0) {
					throw new EOFException();
				}
				local76 += local103;
				@Pc(121) int local121 = local76 * 100 / local28.length;
				if (local121 != local78) {
					local4.setColor(Color.black);
					local78 = local121;
					local4.fillRect(0, 0, this.anInt2832, this.anInt2831);
					local4.setColor(local25);
					local4.drawRect(this.anInt2832 / 2 - 152, this.anInt2831 / 2 + -18, 303, 33);
					@Pc(177) String local177 = "Loading " + arg1 + " - " + local121 + "%";
					local4.setFont(local16);
					local4.setColor(Color.white);
					local4.drawString(local177, (this.anInt2832 - local20.stringWidth(local177)) / 2, this.anInt2831 / 2 + 4);
				}
			}
			local38.close();
			return this.method1818(local28, arg0) ? local28 : null;
		} catch (@Pc(206) IOException local206) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt2832 = Integer.parseInt(this.getParameter("width"));
			this.anInt2831 = Integer.parseInt(this.getParameter("height"));
			@Pc(15) int local15 = 32;
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local15 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			try {
				this.aClass67_1 = new Class67(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local15, "runescape", 12);
			} catch (@Pc(42) Exception local42) {
				this.method1815("nocache");
				return;
			}
			@Pc(51) ClassLoader_Sub1 local51 = new ClassLoader_Sub1();
			@Pc(73) byte[] local73;
			try {
				Class.forName("java.util.jar.Pack200");
				local73 = this.method1820(189479, "game code", "runescape.pack200?crc=1151822830", this.aClass67_1.aString9 + "main_file_cache.dat0");
				if (local73 == null) {
					return;
				}
				local51.aClass65_1 = new Class65_Sub1(local73);
			} catch (@Pc(85) Throwable local85) {
			}
			@Pc(122) Class local122;
			if (local51.aClass65_1 == null) {
				local73 = this.method1820(17488, "unpacker", "unpackclass.jar?crc=-1913445050", this.aClass67_1.aString10 + "shared_game_unpacker.dat");
				if (local73 == null) {
					return;
				}
				local51.aClass65_1 = new Class65(local73);
				local122 = Class.forName("Class65");
				local51.aHashtable3.put(local122.getName(), local122);
				@Pc(133) Class local133 = local51.loadClass("unpackclass");
				local51 = new ClassLoader_Sub1();
				local73 = this.method1820(200964, "game code", "runescape.js5?crc=868544260", this.aClass67_1.aString9 + "main_file_cache.dat1");
				if (local73 == null) {
					return;
				}
				local51.aClass65_1 = (Class65) local133.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local73, Boolean.TRUE);
			}
			local122 = Class.forName("Class66");
			local51.aHashtable3.put(local122.getName(), local122);
			@Pc(198) Class local198 = Class.forName("Class67");
			local51.aHashtable3.put(local198.getName(), local198);
			local122 = Class.forName("Class68");
			local51.aHashtable3.put(local122.getName(), local122);
			local122 = Class.forName("Interface6");
			local51.aHashtable3.put(local122.getName(), local122);
			local122 = Class.forName("Interface5");
			local51.aHashtable3.put(local122.getName(), local122);
			local122 = local51.loadClass("client");
			this.anApplet3 = (Applet) local122.getDeclaredConstructor().newInstance();
			local122.getMethod("providesignlink", local198).invoke(null, this.aClass67_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(271) Exception local271) {
			this.method1815("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/lang/String;)Z")
	private boolean method1818(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(17) MessageDigest local17 = MessageDigest.getInstance("SHA");
			local17.reset();
			local17.update(arg0);
			@Pc(25) byte[] local25 = local17.digest();
			if (arg1 == "runescape.pack200?crc=1151822830") {
				if (local25[0] != 108 || local25[1] != -62 || local25[2] != 45 || local25[3] != -37 || local25[4] != -62 || local25[5] != 26 || local25[6] != 109 || local25[7] != -87 || local25[8] != 121 || local25[9] != 0 || local25[10] != -57 || local25[11] != -15 || local25[12] != 19 || local25[13] != 38 || local25[14] != -88 || local25[15] != -112 || local25[16] != 6 || local25[17] != -47 || local25[18] != -84 || local25[19] != -21) {
					return false;
				}
			} else if (arg1 == "runescape.js5?crc=868544260") {
				if (local25[0] != -56 || local25[1] != 116 || local25[2] != 53 || local25[3] != -32 || local25[4] != -84 || local25[5] != -50 || local25[6] != -83 || local25[7] != 123 || local25[8] != 31 || local25[9] != 47 || local25[10] != 16 || local25[11] != 89 || local25[12] != -116 || local25[13] != 42 || local25[14] != -30 || local25[15] != 33 || local25[16] != -106 || local25[17] != 81 || local25[18] != 89 || local25[19] != 25) {
					return false;
				}
			} else if (local25[0] != -23 || local25[1] != 123 || local25[2] != 122 || local25[3] != 121 || local25[4] != 49 || local25[5] != 24 || local25[6] != 124 || local25[7] != -66 || local25[8] != 115 || local25[9] != 50 || local25[10] != 87 || local25[11] != 112 || local25[12] != -32 || local25[13] != 41 || local25[14] != 66 || local25[15] != -127 || local25[16] != 12 || local25[17] != -117 || local25[18] != -64 || local25[19] != -100) {
				return false;
			}
			return true;
		} catch (@Pc(418) Exception local418) {
			this.method1815("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	private byte[] method1819(@OriginalArg(1) String arg0) {
		try {
			@Pc(10) File local10 = new File(arg0);
			if (!local10.exists()) {
				return null;
			}
			@Pc(19) int local19 = (int) local10.length();
			@Pc(22) byte[] local22 = new byte[local19];
			@Pc(33) DataInputStream local33 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local33.readFully(local22, 0, local19);
			local33.close();
			return local22;
		} catch (@Pc(43) IOException local43) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;BLjava/lang/String;)[B")
	private byte[] method1820(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3) {
		@Pc(6) byte[] local6 = this.method1819(arg3);
		if (!this.method1818(local6, arg2)) {
			local6 = this.method1817(arg2, arg1, false, arg0);
			if (local6 == null) {
				local6 = this.method1817(arg2, arg1, true, arg0);
			}
			if (local6 == null) {
				this.method1815("download");
				return null;
			}
			if (!this.method1816(local6, arg3)) {
				return null;
			}
			local6 = this.method1819(arg3);
			if (!this.method1818(local6, arg2)) {
				this.method1815("mismatch");
				return null;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(6) Thread local6 = new Thread(this);
		local6.start();
	}
}
