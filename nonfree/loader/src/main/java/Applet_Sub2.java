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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt4672;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt4673;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean185;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean186;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean187;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean188;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;IZLjava/lang/String;)[B")
	private byte[] method3596(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = new byte[arg2];
		@Pc(11) Font local11 = new Font("Helvetica", 1, 13);
		@Pc(15) FontMetrics local15 = this.getFontMetrics(local11);
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(66) InputStream local66;
			if (arg0) {
				@Pc(30) URL local30 = this.getCodeBase();
				@Pc(38) Socket local38 = new Socket(InetAddress.getByName(local30.getHost()), 443);
				local38.setSoTimeout(10000);
				@Pc(44) OutputStream local44 = local38.getOutputStream();
				local44.write(17);
				local44.write(("JAGGRAB " + local30.getFile() + arg1 + "\n\n").getBytes());
				local66 = local38.getInputStream();
			} else {
				local66 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = 0;
			while (local4.length > local80) {
				@Pc(94) int local94 = local4.length - local80;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(105) int local105 = local66.read(local4, local80, local94);
				if (local105 < 0) {
					throw new EOFException();
				}
				local80 += local105;
				@Pc(124) int local124 = local80 * 100 / local4.length;
				if (local78 != local124) {
					try {
						@Pc(134) Graphics local134 = this.getGraphics();
						if (local134 == null) {
							this.repaint();
						} else {
							local134.setColor(Color.black);
							local78 = local124;
							@Pc(154) String local154 = arg3 + " - " + local124 + "%";
							local134.fillRect(0, 0, this.anInt4672, this.anInt4673);
							local134.setColor(local20);
							local134.drawRect(this.anInt4672 / 2 - 152, this.anInt4673 / 2 - 18, 303, 33);
							local134.setFont(local11);
							local134.setColor(Color.white);
							local134.drawString(local154, (this.anInt4672 - local15.stringWidth(local154)) / 2, this.anInt4673 / 2 + 4);
						}
					} catch (@Pc(211) Exception local211) {
					}
				}
			}
			local66.close();
		} catch (@Pc(217) IOException local217) {
			return null;
		}
		return this.method3599(local4, arg1) ? local4 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method3597(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(25) DataInputStream local25 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local9];
			local25.readFully(local28, 0, local9);
			local25.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method3598(@OriginalArg(1) String arg0) {
		if (this.aBoolean185) {
			return;
		}
		this.aBoolean185 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;I)Z")
	private boolean method3599(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(6) MessageDigest local6 = MessageDigest.getInstance("SHA");
			local6.reset();
			local6.update(arg0);
			@Pc(14) byte[] local14 = local6.digest();
			if (arg1 == "runescape_571303192.pack200") {
				if (local14[0] != 92 || local14[1] != -90 || local14[2] != -122 || local14[3] != 18 || local14[4] != -59 || local14[5] != 116 || local14[6] != 56 || local14[7] != -53 || local14[8] != -8 || local14[9] != -13 || local14[10] != -72 || local14[11] != -84 || local14[12] != 95 || local14[13] != 6 || local14[14] != 83 || local14[15] != 51 || local14[16] != -40 || local14[17] != -112 || local14[18] != 116 || local14[19] != -124) {
					return false;
				}
			} else if (arg1 == "runescape_-1319031127.js5") {
				if (local14[0] != 126 || local14[1] != -125 || local14[2] != 63 || local14[3] != -104 || local14[4] != 85 || local14[5] != -42 || local14[6] != 10 || local14[7] != 107 || local14[8] != 122 || local14[9] != 6 || local14[10] != 119 || local14[11] != 103 || local14[12] != -53 || local14[13] != 93 || local14[14] != -79 || local14[15] != 122 || local14[16] != -126 || local14[17] != -84 || local14[18] != 117 || local14[19] != 107) {
					return false;
				}
			} else if (arg1 == "unpackclass_-163111980.pack") {
				if (local14[0] != 23 || local14[1] != 83 || local14[2] != 57 || local14[3] != 35 || local14[4] != 83 || local14[5] != -48 || local14[6] != 29 || local14[7] != -121 || local14[8] != 101 || local14[9] != 45 || local14[10] != -13 || local14[11] != -62 || local14[12] != -10 || local14[13] != 46 || local14[14] != -57 || local14[15] != -48 || local14[16] != 115 || local14[17] != 102 || local14[18] != 94 || local14[19] != 95) {
					return false;
				}
			} else if (arg1 == "jogl_181740960.pack") {
				if (local14[0] != 74 || local14[1] != 7 || local14[2] != -54 || local14[3] != 86 || local14[4] != 3 || local14[5] != 113 || local14[6] != -45 || local14[7] != -123 || local14[8] != 63 || local14[9] != 97 || local14[10] != 69 || local14[11] != -41 || local14[12] != -121 || local14[13] != 126 || local14[14] != -30 || local14[15] != -32 || local14[16] != 33 || local14[17] != -122 || local14[18] != -111 || local14[19] != 63) {
					return false;
				}
			} else if (arg1 == "jogl_-1134983286.dll") {
				if (local14[0] != 43 || local14[1] != 73 || local14[2] != -119 || local14[3] != -99 || local14[4] != -19 || local14[5] != 109 || local14[6] != -62 || local14[7] != 40 || local14[8] != 41 || local14[9] != -91 || local14[10] != -88 || local14[11] != -50 || local14[12] != -38 || local14[13] != -127 || local14[14] != -126 || local14[15] != 33 || local14[16] != -93 || local14[17] != -95 || local14[18] != -123 || local14[19] != 66) {
					return false;
				}
			} else if (arg1 == "jogl_awt_-532687481.dll" && (local14[0] != -26 || local14[1] != 91 || local14[2] != -12 || local14[3] != -87 || local14[4] != 122 || local14[5] != -5 || local14[6] != 108 || local14[7] != 94 || local14[8] != 20 || local14[9] != 111 || local14[10] != 116 || local14[11] != -56 || local14[12] != -10 || local14[13] != 66 || local14[14] != -92 || local14[15] != -125 || local14[16] != -41 || local14[17] != 70 || local14[18] != 81 || local14[19] != -71)) {
				return false;
			}
			return true;
		} catch (@Pc(783) Exception local783) {
			this.method3598("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;ILjava/lang/String;)[B")
	private byte[] method3600(@OriginalArg(1) String arg0, @OriginalArg(2) File arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(12) byte[] local12 = this.method3597(arg1);
		if (!this.method3599(local12, arg3)) {
			local12 = this.method3596(false, arg3, arg2, arg0);
			if (local12 == null) {
				local12 = this.method3596(true, arg3, arg2, arg0);
			}
			if (local12 == null) {
				this.method3598("download");
				return null;
			}
			if (!this.method3601(arg1, local12)) {
				return null;
			}
			local12 = this.method3597(arg1);
			if (!this.method3599(local12, arg3)) {
				this.method3598("mismatch");
				return null;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean188 = this.aBoolean186 = false;
		this.aBoolean187 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean188 = false;
		this.aBoolean186 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean186 = false;
		this.aBoolean188 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean187 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt4672 = Integer.parseInt(this.getParameter("width"));
			this.anInt4673 = Integer.parseInt(this.getParameter("height"));
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
					local26 = "Lade Spiel-Code";
					local28 = "Lade Entpacker";
				}
			} catch (@Pc(44) Exception local44) {
			}
			@Pc(53) Class99 local53;
			try {
				local53 = new Class99(true, this, local1, "runescape", 23);
			} catch (@Pc(55) Exception local55) {
				this.method3598("nocache");
				return;
			}
			@Pc(64) ClassLoader_Sub1 local64 = new ClassLoader_Sub1();
			try {
				@Pc(66) String local66 = "main_file_cache.dat0";
				Class.forName("java.util.jar.Pack200");
				@Pc(82) byte[] local82 = this.method3600(local26, new File(local53.aFile6, local66), 295322, "runescape_571303192.pack200");
				if (local82 == null) {
					return;
				}
				local64.aClass96_1 = new Class96_Sub1(local82);
			} catch (@Pc(94) Throwable local94) {
			}
			if (local64.aClass96_1 == null) {
				@Pc(112) byte[] local112 = this.method3600(local28, new File(local53.aFile6, "game_unpacker.dat"), 19185, "unpackclass_-163111980.pack");
				if (local112 == null) {
					return;
				}
				@Pc(121) ClassLoader_Sub1 local121 = new ClassLoader_Sub1();
				local121.aClass96_1 = new Class96(local112);
				@Pc(130) Class local130 = Class.forName("Class96");
				local121.aHashtable1.put(local130.getName(), local130);
				@Pc(141) Class local141 = local121.loadClass("unpackclass");
				@Pc(143) String local143 = "main_file_cache.dat1";
				local112 = this.method3600(local26, new File(local53.aFile6, local143), 304777, "runescape_-1319031127.js5");
				if (local112 == null) {
					return;
				}
				local64.aClass96_1 = (Class96) local141.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local112, Boolean.TRUE);
			}
			@Pc(190) Class local190 = Class.forName("Class98");
			local64.aHashtable1.put(local190.getName(), local190);
			@Pc(200) Class local200 = Class.forName("Class99");
			local64.aHashtable1.put(local200.getName(), local200);
			@Pc(210) Class local210 = Class.forName("Class97");
			local64.aHashtable1.put(local210.getName(), local210);
			@Pc(220) Class local220 = Class.forName("Interface4");
			local64.aHashtable1.put(local220.getName(), local220);
			@Pc(231) Class local231 = local64.loadClass("client");
			synchronized (this) {
				if (this.aBoolean187) {
					return;
				}
				this.anApplet2 = (Applet) local231.getDeclaredConstructor().newInstance();
				local231.getMethod("providesignlink", local200).invoke(null, local53);
				this.anApplet2.init();
				if (this.aBoolean188) {
					this.anApplet2.start();
				}
				if (this.aBoolean186) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(290) Exception local290) {
			RuntimeException_Sub2.anInt4667 = -1319031127;
			if (local290 instanceof InvocationTargetException) {
				@Pc(306) Throwable local306 = ((InvocationTargetException) local290).getTargetException();
				if (local306 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3586(this, local290.toString(), local306);
			} else {
				RuntimeException_Sub2.method3586(this, null, local290);
			}
			this.method3598("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method3601(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method3598("savefile");
			return false;
		}
	}
}
