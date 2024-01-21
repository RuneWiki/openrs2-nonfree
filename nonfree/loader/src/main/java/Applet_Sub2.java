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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt4711;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt4712;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean234;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean236;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean233;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean235;

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt4711 = Integer.parseInt(this.getParameter("width"));
			this.anInt4712 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local1 += local18;
			} catch (@Pc(24) Exception local24) {
			}
			@Pc(26) String local26 = "Loading unpacker";
			@Pc(28) String local28 = "Loading game code";
			try {
				@Pc(32) String local32 = this.getParameter("lang");
				if (local32 != null && local32.equals("1")) {
					local28 = "Lade Spiel-Code";
					local26 = "Lade Entpacker";
				}
			} catch (@Pc(45) Exception local45) {
			}
			@Pc(54) Class105 local54;
			try {
				local54 = new Class105(true, this, local1, "runescape", 24);
			} catch (@Pc(56) Exception local56) {
				this.method3608("nocache");
				return;
			}
			@Pc(65) ClassLoader_Sub1 local65 = new ClassLoader_Sub1();
			try {
				Class.forName("java.util.jar.Pack200");
				@Pc(70) String local70 = "main_file_cache.dat0";
				@Pc(83) byte[] local83 = this.method3606(new File(local54.aFile6, local70), 321752, local28, "runescape_-147722411.pack200");
				if (local83 == null) {
					return;
				}
				local65.aClass102_1 = new Class102_Sub1(local83);
			} catch (@Pc(96) Throwable local96) {
			}
			if (local65.aClass102_1 == null) {
				@Pc(114) byte[] local114 = this.method3606(new File(local54.aFile6, "game_unpacker.dat"), 19590, local26, "unpackclass_-462058432.pack");
				if (local114 == null) {
					return;
				}
				@Pc(122) ClassLoader_Sub1 local122 = new ClassLoader_Sub1();
				local122.aClass102_1 = new Class102(local114);
				@Pc(131) Class local131 = Class.forName("Class102");
				local122.aHashtable3.put(local131.getName(), local131);
				@Pc(142) Class local142 = local122.loadClass("unpackclass");
				@Pc(144) String local144 = "main_file_cache.dat1";
				local114 = this.method3606(new File(local54.aFile6, local144), 322916, local28, "runescape_-1147841792.js5");
				if (local114 == null) {
					return;
				}
				local65.aClass102_1 = (Class102) local142.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local114, Boolean.TRUE);
			}
			@Pc(190) Class local190 = Class.forName("Class103");
			local65.aHashtable3.put(local190.getName(), local190);
			@Pc(200) Class local200 = Class.forName("Class105");
			local65.aHashtable3.put(local200.getName(), local200);
			@Pc(210) Class local210 = Class.forName("Class104");
			local65.aHashtable3.put(local210.getName(), local210);
			@Pc(220) Class local220 = Class.forName("Interface4");
			local65.aHashtable3.put(local220.getName(), local220);
			@Pc(231) Class local231 = local65.loadClass("client");
			synchronized (this) {
				if (this.aBoolean233) {
					return;
				}
				this.anApplet2 = (Applet) local231.getDeclaredConstructor().newInstance();
				local231.getMethod("providesignlink", local200).invoke(null, local54);
				this.anApplet2.init();
				if (this.aBoolean235) {
					this.anApplet2.start();
				}
				if (this.aBoolean234) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(291) Exception local291) {
			RuntimeException_Sub2.anInt4710 = -1147841792;
			if (local291 instanceof InvocationTargetException) {
				@Pc(307) Throwable local307 = ((InvocationTargetException) local291).getTargetException();
				if (local307 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3590(local291.toString(), local307, this);
			} else {
				RuntimeException_Sub2.method3590(null, local291, this);
			}
			this.method3608("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean234 = false;
		this.aBoolean235 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method3605(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(18) byte[] local18 = new byte[local9];
			@Pc(29) DataInputStream local29 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local29.readFully(local18, 0, local9);
			local29.close();
			return local18;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;IBLjava/lang/String;Ljava/lang/String;)[B")
	private byte[] method3606(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(10) byte[] local10 = this.method3605(arg0);
		if (!this.method3610(local10, arg3)) {
			local10 = this.method3609(arg2, arg3, arg1, false);
			if (local10 == null) {
				local10 = this.method3609(arg2, arg3, arg1, true);
			}
			if (local10 == null) {
				this.method3608("download");
				return null;
			}
			if (!this.method3607(arg0, local10)) {
				return null;
			}
			local10 = this.method3605(arg0);
			if (!this.method3610(local10, arg3)) {
				this.method3608("mismatch");
				return null;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method3607(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method3608("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean233 = true;
		this.aBoolean235 = this.aBoolean234 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method3608(@OriginalArg(0) String arg0) {
		if (this.aBoolean236) {
			return;
		}
		this.aBoolean236 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean234 = true;
		this.aBoolean235 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZIZ)[B")
	private byte[] method3609(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg2];
		try {
			@Pc(36) InputStream local36;
			if (arg3) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg1 + "\n\n").getBytes());
				local36 = local49.getInputStream();
			} else {
				local36 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = 0;
			while (local20.length > local81) {
				@Pc(94) int local94 = local20.length - local81;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(107) int local107 = local36.read(local20, local81, local94);
				if (local107 < 0) {
					throw new EOFException();
				}
				local81 += local107;
				@Pc(124) int local124 = local81 * 100 / local20.length;
				if (local79 != local124) {
					try {
						@Pc(134) Graphics local134 = this.getGraphics();
						if (local134 == null) {
							this.repaint();
						} else {
							local134.setColor(Color.black);
							local79 = local124;
							@Pc(159) String local159 = arg0 + " - " + local124 + "%";
							local134.fillRect(0, 0, this.anInt4711, this.anInt4712);
							local134.setColor(local17);
							local134.drawRect(this.anInt4711 / 2 - 152, this.anInt4712 / 2 + -18, 303, 33);
							local134.setFont(local8);
							local134.setColor(Color.white);
							local134.drawString(local159, (this.anInt4711 - local12.stringWidth(local159)) / 2, this.anInt4712 / 2 + 4);
						}
					} catch (@Pc(212) Exception local212) {
					}
				}
			}
			local36.close();
		} catch (@Pc(218) IOException local218) {
			return null;
		}
		return this.method3610(local20, arg1) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;B)Z")
	private boolean method3610(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(12) MessageDigest local12 = MessageDigest.getInstance("SHA");
			local12.reset();
			local12.update(arg0);
			@Pc(20) byte[] local20 = local12.digest();
			if (arg1 == "runescape_-147722411.pack200") {
				if (local20[0] != 102 || local20[1] != -77 || local20[2] != -33 || local20[3] != 75 || local20[4] != 29 || local20[5] != 66 || local20[6] != -45 || local20[7] != -14 || local20[8] != 34 || local20[9] != -27 || local20[10] != -120 || local20[11] != -49 || local20[12] != -45 || local20[13] != 2 || local20[14] != -121 || local20[15] != -118 || local20[16] != -73 || local20[17] != 55 || local20[18] != -90 || local20[19] != 68) {
					return false;
				}
			} else if (arg1 == "runescape_-1147841792.js5") {
				if (local20[0] != -102 || local20[1] != -14 || local20[2] != 13 || local20[3] != 24 || local20[4] != -47 || local20[5] != 8 || local20[6] != 31 || local20[7] != 78 || local20[8] != -59 || local20[9] != -80 || local20[10] != -95 || local20[11] != -86 || local20[12] != 38 || local20[13] != 114 || local20[14] != 4 || local20[15] != 106 || local20[16] != -120 || local20[17] != 87 || local20[18] != 43 || local20[19] != -12) {
					return false;
				}
			} else if (arg1 == "unpackclass_-462058432.pack") {
				if (local20[0] != 88 || local20[1] != 0 || local20[2] != -7 || local20[3] != -109 || local20[4] != 43 || local20[5] != -100 || local20[6] != -104 || local20[7] != 7 || local20[8] != -25 || local20[9] != 69 || local20[10] != 28 || local20[11] != 18 || local20[12] != 106 || local20[13] != 112 || local20[14] != 33 || local20[15] != 50 || local20[16] != 123 || local20[17] != -108 || local20[18] != -80 || local20[19] != 35) {
					return false;
				}
			} else if (arg1 == "jogl_181740960.pack") {
				if (local20[0] != 74 || local20[1] != 7 || local20[2] != -54 || local20[3] != 86 || local20[4] != 3 || local20[5] != 113 || local20[6] != -45 || local20[7] != -123 || local20[8] != 63 || local20[9] != 97 || local20[10] != 69 || local20[11] != -41 || local20[12] != -121 || local20[13] != 126 || local20[14] != -30 || local20[15] != -32 || local20[16] != 33 || local20[17] != -122 || local20[18] != -111 || local20[19] != 63) {
					return false;
				}
			} else if (arg1 == "jogl_-1134983286.dll") {
				if (local20[0] != 43 || local20[1] != 73 || local20[2] != -119 || local20[3] != -99 || local20[4] != -19 || local20[5] != 109 || local20[6] != -62 || local20[7] != 40 || local20[8] != 41 || local20[9] != -91 || local20[10] != -88 || local20[11] != -50 || local20[12] != -38 || local20[13] != -127 || local20[14] != -126 || local20[15] != 33 || local20[16] != -93 || local20[17] != -95 || local20[18] != -123 || local20[19] != 66) {
					return false;
				}
			} else if (arg1 == "jogl_awt_-532687481.dll" && (local20[0] != -26 || local20[1] != 91 || local20[2] != -12 || local20[3] != -87 || local20[4] != 122 || local20[5] != -5 || local20[6] != 108 || local20[7] != 94 || local20[8] != 20 || local20[9] != 111 || local20[10] != 116 || local20[11] != -56 || local20[12] != -10 || local20[13] != 66 || local20[14] != -92 || local20[15] != -125 || local20[16] != -41 || local20[17] != 70 || local20[18] != 81 || local20[19] != -71)) {
				return false;
			}
			return true;
		} catch (@Pc(757) Exception local757) {
			this.method3608("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean233 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}
}
