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
import java.lang.reflect.InvocationTargetException;
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

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt4564;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt4565;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean198;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean199;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean200;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean197;

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean198 = this.aBoolean197 = false;
		this.aBoolean199 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILjava/lang/String;ZLjava/lang/String;)[B")
	private byte[] method3226(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg1];
		try {
			@Pc(61) InputStream local61;
			if (arg0) {
				@Pc(25) URL local25 = this.getCodeBase();
				@Pc(33) Socket local33 = new Socket(InetAddress.getByName(local25.getHost()), 443);
				local33.setSoTimeout(10000);
				@Pc(39) OutputStream local39 = local33.getOutputStream();
				local39.write(17);
				local39.write(("JAGGRAB " + local25.getFile() + arg3 + "\n\n").getBytes());
				local61 = local33.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg3)).openStream();
			}
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = 0;
			while (local20.length > local80) {
				@Pc(94) int local94 = local20.length - local80;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(106) int local106 = local61.read(local20, local80, local94);
				if (local106 < 0) {
					throw new EOFException();
				}
				local80 += local106;
				@Pc(127) int local127 = local80 * 100 / local20.length;
				if (local127 != local78) {
					try {
						@Pc(138) Graphics local138 = this.getGraphics();
						if (local138 == null) {
							this.repaint();
						} else {
							local78 = local127;
							local138.setColor(Color.black);
							local138.fillRect(0, 0, this.anInt4565, this.anInt4564);
							@Pc(167) String local167 = arg2 + " - " + local127 + "%";
							local138.setColor(local17);
							local138.drawRect(this.anInt4565 / 2 - 152, this.anInt4564 / 2 + -18, 303, 33);
							local138.setFont(local8);
							local138.setColor(Color.white);
							local138.drawString(local167, (this.anInt4565 - local12.stringWidth(local167)) / 2, this.anInt4564 / 2 + 4);
						}
					} catch (@Pc(216) Exception local216) {
					}
				}
			}
			local61.close();
		} catch (@Pc(222) IOException local222) {
			return null;
		}
		return this.method3228(local20, arg3) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean197 = false;
		this.aBoolean198 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLjava/io/File;)Z")
	private boolean method3227(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method3231("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;I)Z")
	private boolean method3228(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg0);
			@Pc(21) byte[] local21 = local7.digest();
			if (arg1 == "runescape_-224114870.pack200") {
				if (local21[0] != 49 || local21[1] != -37 || local21[2] != -84 || local21[3] != 38 || local21[4] != 57 || local21[5] != -100 || local21[6] != 94 || local21[7] != -26 || local21[8] != 12 || local21[9] != -43 || local21[10] != 73 || local21[11] != -114 || local21[12] != -98 || local21[13] != -100 || local21[14] != 125 || local21[15] != 109 || local21[16] != -19 || local21[17] != 90 || local21[18] != -82 || local21[19] != -2) {
					return false;
				}
			} else if (arg1 == "runescape_1555726476.js5") {
				if (local21[0] != -20 || local21[1] != 96 || local21[2] != -32 || local21[3] != 81 || local21[4] != -5 || local21[5] != -13 || local21[6] != -61 || local21[7] != 104 || local21[8] != -120 || local21[9] != -73 || local21[10] != -39 || local21[11] != 27 || local21[12] != -3 || local21[13] != 106 || local21[14] != 13 || local21[15] != 2 || local21[16] != -13 || local21[17] != 31 || local21[18] != 85 || local21[19] != 51) {
					return false;
				}
			} else if (arg1 == "unpackclass_-462058432.pack") {
				if (local21[0] != 88 || local21[1] != 0 || local21[2] != -7 || local21[3] != -109 || local21[4] != 43 || local21[5] != -100 || local21[6] != -104 || local21[7] != 7 || local21[8] != -25 || local21[9] != 69 || local21[10] != 28 || local21[11] != 18 || local21[12] != 106 || local21[13] != 112 || local21[14] != 33 || local21[15] != 50 || local21[16] != 123 || local21[17] != -108 || local21[18] != -80 || local21[19] != 35) {
					return false;
				}
			} else if (arg1 == "jogl_181740960.pack") {
				if (local21[0] != 74 || local21[1] != 7 || local21[2] != -54 || local21[3] != 86 || local21[4] != 3 || local21[5] != 113 || local21[6] != -45 || local21[7] != -123 || local21[8] != 63 || local21[9] != 97 || local21[10] != 69 || local21[11] != -41 || local21[12] != -121 || local21[13] != 126 || local21[14] != -30 || local21[15] != -32 || local21[16] != 33 || local21[17] != -122 || local21[18] != -111 || local21[19] != 63) {
					return false;
				}
			} else if (arg1 == "jogl_-1134983286.dll") {
				if (local21[0] != 43 || local21[1] != 73 || local21[2] != -119 || local21[3] != -99 || local21[4] != -19 || local21[5] != 109 || local21[6] != -62 || local21[7] != 40 || local21[8] != 41 || local21[9] != -91 || local21[10] != -88 || local21[11] != -50 || local21[12] != -38 || local21[13] != -127 || local21[14] != -126 || local21[15] != 33 || local21[16] != -93 || local21[17] != -95 || local21[18] != -123 || local21[19] != 66) {
					return false;
				}
			} else if (arg1 == "jogl_awt_-532687481.dll" && (local21[0] != -26 || local21[1] != 91 || local21[2] != -12 || local21[3] != -87 || local21[4] != 122 || local21[5] != -5 || local21[6] != 108 || local21[7] != 94 || local21[8] != 20 || local21[9] != 111 || local21[10] != 116 || local21[11] != -56 || local21[12] != -10 || local21[13] != 66 || local21[14] != -92 || local21[15] != -125 || local21[16] != -41 || local21[17] != 70 || local21[18] != 81 || local21[19] != -71)) {
				return false;
			}
			return true;
		} catch (@Pc(770) Exception local770) {
			this.method3231("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;ILjava/lang/String;)[B")
	private byte[] method3229(@OriginalArg(0) File arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = this.method3230(arg0);
		if (!this.method3228(local4, arg1)) {
			local4 = this.method3226(false, arg2, arg3, arg1);
			if (local4 == null) {
				local4 = this.method3226(true, arg2, arg3, arg1);
			}
			if (local4 == null) {
				this.method3231("download");
				return null;
			}
			if (!this.method3227(local4, arg0)) {
				return null;
			}
			local4 = this.method3230(arg0);
			if (!this.method3228(local4, arg1)) {
				this.method3231("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Z)[B")
	private byte[] method3230(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(11) byte[] local11 = new byte[local8];
			@Pc(22) DataInputStream local22 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local22.readFully(local11, 0, local8);
			local22.close();
			return local11;
		} catch (@Pc(37) IOException local37) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt4565 = Integer.parseInt(this.getParameter("width"));
			this.anInt4564 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local1 += local18;
			} catch (@Pc(24) Exception local24) {
			}
			@Pc(26) String local26 = "Loading game code";
			@Pc(28) String local28 = "Loading unpacker";
			try {
				@Pc(32) String local32 = this.getParameter("lang");
				if (local32 != null && local32.equals("1")) {
					local28 = "Lade Entpacker";
					local26 = "Lade Spiel-Code";
				}
			} catch (@Pc(46) Exception local46) {
			}
			@Pc(55) Class108 local55;
			try {
				local55 = new Class108(true, this, local1, "runescape", 24);
			} catch (@Pc(57) Exception local57) {
				this.method3231("nocache");
				return;
			}
			@Pc(66) ClassLoader_Sub1 local66 = new ClassLoader_Sub1();
			try {
				Class.forName("java.util.jar.Pack200");
				@Pc(71) String local71 = "main_file_cache.dat0";
				@Pc(84) byte[] local84 = this.method3229(new File(local55.aFile4, local71), "runescape_-224114870.pack200", 323292, local26);
				if (local84 == null) {
					return;
				}
				local66.aClass107_1 = new Class107_Sub1(local84);
			} catch (@Pc(96) Throwable local96) {
			}
			if (local66.aClass107_1 == null) {
				@Pc(112) byte[] local112 = this.method3229(new File(local55.aFile4, "game_unpacker.dat"), "unpackclass_-462058432.pack", 19590, local28);
				if (local112 == null) {
					return;
				}
				@Pc(120) ClassLoader_Sub1 local120 = new ClassLoader_Sub1();
				@Pc(122) String local122 = "main_file_cache.dat1";
				local120.aClass107_1 = new Class107(local112);
				@Pc(131) Class local131 = Class.forName("Class107");
				local120.aHashtable3.put(local131.getName(), local131);
				@Pc(142) Class local142 = local120.loadClass("unpackclass");
				local112 = this.method3229(new File(local55.aFile4, local122), "runescape_1555726476.js5", 326459, local26);
				if (local112 == null) {
					return;
				}
				local66.aClass107_1 = (Class107) local142.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local112, Boolean.TRUE);
			}
			@Pc(189) Class local189 = Class.forName("Class110");
			local66.aHashtable3.put(local189.getName(), local189);
			@Pc(199) Class local199 = Class.forName("Class108");
			local66.aHashtable3.put(local199.getName(), local199);
			@Pc(209) Class local209 = Class.forName("Class109");
			local66.aHashtable3.put(local209.getName(), local209);
			@Pc(219) Class local219 = Class.forName("Interface4");
			local66.aHashtable3.put(local219.getName(), local219);
			@Pc(230) Class local230 = local66.loadClass("client");
			synchronized (this) {
				if (this.aBoolean199) {
					return;
				}
				this.anApplet3 = (Applet) local230.getDeclaredConstructor().newInstance();
				local230.getMethod("providesignlink", local199).invoke(null, local55);
				this.anApplet3.init();
				if (this.aBoolean198) {
					this.anApplet3.start();
				}
				if (this.aBoolean197) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(290) Exception local290) {
			RuntimeException_Sub2.anInt4558 = 1555726476;
			if (local290 instanceof InvocationTargetException) {
				@Pc(299) Throwable local299 = ((InvocationTargetException) local290).getTargetException();
				if (local299 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3206(local299, local290.toString(), this);
			} else {
				RuntimeException_Sub2.method3206(local290, null, this);
			}
			this.method3231("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method3231(@OriginalArg(1) String arg0) {
		if (this.aBoolean200) {
			return;
		}
		this.aBoolean200 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean198 = false;
		this.aBoolean197 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean199 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}
}
