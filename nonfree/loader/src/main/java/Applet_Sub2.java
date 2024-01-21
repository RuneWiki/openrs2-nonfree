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

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt4194;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt4195;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean183;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean182;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean184;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean185;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;IZLjava/lang/String;)[B")
	private byte[] method3207(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg0];
		try {
			@Pc(30) InputStream local30;
			if (arg2) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg3 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg3)).openStream();
			}
			@Pc(73) int local73 = -1;
			@Pc(81) int local81 = 0;
			while (local20.length > local81) {
				@Pc(90) int local90 = local20.length - local81;
				if (local90 > 1000) {
					local90 = 1000;
				}
				@Pc(103) int local103 = local30.read(local20, local81, local90);
				if (local103 < 0) {
					throw new EOFException();
				}
				local81 += local103;
				@Pc(122) int local122 = local81 * 100 / local20.length;
				if (local73 != local122) {
					try {
						@Pc(128) Graphics local128 = this.getGraphics();
						if (local128 == null) {
							this.repaint();
						} else {
							local73 = local122;
							local128.setColor(Color.black);
							@Pc(148) String local148 = arg1 + " - " + local122 + "%";
							local128.fillRect(0, 0, this.anInt4194, this.anInt4195);
							local128.setColor(local17);
							local128.drawRect(this.anInt4194 / 2 - 152, this.anInt4195 / 2 + -18, 303, 33);
							local128.setFont(local8);
							local128.setColor(Color.white);
							local128.drawString(local148, (this.anInt4194 - local12.stringWidth(local148)) / 2, this.anInt4195 / 2 + 4);
						}
					} catch (@Pc(205) Exception local205) {
					}
				}
			}
			local30.close();
		} catch (@Pc(211) IOException local211) {
			return null;
		}
		return this.method3212(local20, arg3) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method3208(@OriginalArg(1) String arg0) {
		if (this.aBoolean184) {
			return;
		}
		this.aBoolean184 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method3209(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(23) byte[] local23 = new byte[local9];
			local20.readFully(local23, 0, local9);
			local20.close();
			return local23;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4194 = Integer.parseInt(this.getParameter("width"));
			this.anInt4195 = Integer.parseInt(this.getParameter("height"));
			@Pc(13) int local13 = 32;
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local13 += local18;
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
			@Pc(53) Class97 local53;
			try {
				local53 = new Class97(true, this, local13, "runescape", 23);
			} catch (@Pc(55) Exception local55) {
				this.method3208("nocache");
				return;
			}
			@Pc(64) ClassLoader_Sub1 local64 = new ClassLoader_Sub1();
			try {
				Class.forName("java.util.jar.Pack200");
				@Pc(69) String local69 = "main_file_cache.dat0";
				@Pc(82) byte[] local82 = this.method3210(local26, new File(local53.aFile5, local69), 285721, "runescape_665978121.pack200");
				if (local82 == null) {
					return;
				}
				local64.aClass95_1 = new Class95_Sub1(local82);
			} catch (@Pc(94) Throwable local94) {
			}
			if (local64.aClass95_1 == null) {
				@Pc(111) byte[] local111 = this.method3210(local28, new File(local53.aFile5, "game_unpacker.dat"), 19185, "unpackclass_-163111980.pack");
				if (local111 == null) {
					return;
				}
				@Pc(119) ClassLoader_Sub1 local119 = new ClassLoader_Sub1();
				local119.aClass95_1 = new Class95(local111);
				@Pc(128) Class local128 = Class.forName("Class95");
				@Pc(130) String local130 = "main_file_cache.dat1";
				local119.aHashtable3.put(local128.getName(), local128);
				@Pc(141) Class local141 = local119.loadClass("unpackclass");
				local111 = this.method3210(local26, new File(local53.aFile5, local130), 295908, "runescape_-1569918820.js5");
				if (local111 == null) {
					return;
				}
				local64.aClass95_1 = (Class95) local141.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local111, Boolean.TRUE);
			}
			@Pc(187) Class local187 = Class.forName("Class96");
			local64.aHashtable3.put(local187.getName(), local187);
			@Pc(197) Class local197 = Class.forName("Class97");
			local64.aHashtable3.put(local197.getName(), local197);
			@Pc(207) Class local207 = Class.forName("Class98");
			local64.aHashtable3.put(local207.getName(), local207);
			@Pc(217) Class local217 = Class.forName("Interface4");
			local64.aHashtable3.put(local217.getName(), local217);
			@Pc(228) Class local228 = local64.loadClass("client");
			synchronized (this) {
				if (this.aBoolean182) {
					return;
				}
				this.anApplet2 = (Applet) local228.getDeclaredConstructor().newInstance();
				local228.getMethod("providesignlink", local197).invoke(null, local53);
				this.anApplet2.init();
				if (this.aBoolean185) {
					this.anApplet2.start();
				}
				if (this.aBoolean183) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(288) Exception local288) {
			RuntimeException_Sub2.anInt4192 = -1569918820;
			if (local288 instanceof InvocationTargetException) {
				@Pc(297) Throwable local297 = ((InvocationTargetException) local288).getTargetException();
				if (local297 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3197(local288.toString(), local297, this);
			} else {
				RuntimeException_Sub2.method3197(null, local288, this);
			}
			this.method3208("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;IILjava/lang/String;)[B")
	private byte[] method3210(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = this.method3209(arg1);
		if (!this.method3212(local4, arg3)) {
			local4 = this.method3207(arg2, arg0, false, arg3);
			if (local4 == null) {
				local4 = this.method3207(arg2, arg0, true, arg3);
			}
			if (local4 == null) {
				this.method3208("download");
				return null;
			}
			if (!this.method3211(local4, arg1)) {
				return null;
			}
			local4 = this.method3209(arg1);
			if (!this.method3212(local4, arg3)) {
				this.method3208("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/io/File;)Z")
	private boolean method3211(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method3208("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean185 = false;
		this.aBoolean183 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLjava/lang/String;)Z")
	private boolean method3212(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(16) byte[] local16 = local8.digest();
			if (arg1 == "runescape_665978121.pack200") {
				if (local16[0] != 50 || local16[1] != -12 || local16[2] != -106 || local16[3] != -74 || local16[4] != 34 || local16[5] != 46 || local16[6] != 75 || local16[7] != 59 || local16[8] != -35 || local16[9] != 66 || local16[10] != 14 || local16[11] != 13 || local16[12] != 57 || local16[13] != -4 || local16[14] != -55 || local16[15] != 78 || local16[16] != -79 || local16[17] != -32 || local16[18] != 46 || local16[19] != -98) {
					return false;
				}
			} else if (arg1 == "runescape_-1569918820.js5") {
				if (local16[0] != -105 || local16[1] != -128 || local16[2] != 16 || local16[3] != 111 || local16[4] != 114 || local16[5] != -77 || local16[6] != 112 || local16[7] != -70 || local16[8] != -81 || local16[9] != 123 || local16[10] != -89 || local16[11] != 121 || local16[12] != -97 || local16[13] != 84 || local16[14] != -2 || local16[15] != -63 || local16[16] != 26 || local16[17] != -102 || local16[18] != -127 || local16[19] != -87) {
					return false;
				}
			} else if (arg1 == "unpackclass_-163111980.pack") {
				if (local16[0] != 23 || local16[1] != 83 || local16[2] != 57 || local16[3] != 35 || local16[4] != 83 || local16[5] != -48 || local16[6] != 29 || local16[7] != -121 || local16[8] != 101 || local16[9] != 45 || local16[10] != -13 || local16[11] != -62 || local16[12] != -10 || local16[13] != 46 || local16[14] != -57 || local16[15] != -48 || local16[16] != 115 || local16[17] != 102 || local16[18] != 94 || local16[19] != 95) {
					return false;
				}
			} else if (arg1 == "jogl_181740960.pack") {
				if (local16[0] != 74 || local16[1] != 7 || local16[2] != -54 || local16[3] != 86 || local16[4] != 3 || local16[5] != 113 || local16[6] != -45 || local16[7] != -123 || local16[8] != 63 || local16[9] != 97 || local16[10] != 69 || local16[11] != -41 || local16[12] != -121 || local16[13] != 126 || local16[14] != -30 || local16[15] != -32 || local16[16] != 33 || local16[17] != -122 || local16[18] != -111 || local16[19] != 63) {
					return false;
				}
			} else if (arg1 == "jogl_-1134983286.dll") {
				if (local16[0] != 43 || local16[1] != 73 || local16[2] != -119 || local16[3] != -99 || local16[4] != -19 || local16[5] != 109 || local16[6] != -62 || local16[7] != 40 || local16[8] != 41 || local16[9] != -91 || local16[10] != -88 || local16[11] != -50 || local16[12] != -38 || local16[13] != -127 || local16[14] != -126 || local16[15] != 33 || local16[16] != -93 || local16[17] != -95 || local16[18] != -123 || local16[19] != 66) {
					return false;
				}
			} else if (arg1 == "jogl_awt_-532687481.dll" && (local16[0] != -26 || local16[1] != 91 || local16[2] != -12 || local16[3] != -87 || local16[4] != 122 || local16[5] != -5 || local16[6] != 108 || local16[7] != 94 || local16[8] != 20 || local16[9] != 111 || local16[10] != 116 || local16[11] != -56 || local16[12] != -10 || local16[13] != 66 || local16[14] != -92 || local16[15] != -125 || local16[16] != -41 || local16[17] != 70 || local16[18] != 81 || local16[19] != -71)) {
				return false;
			}
			return true;
		} catch (@Pc(798) Exception local798) {
			this.method3208("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean185 = this.aBoolean183 = false;
		this.aBoolean182 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean182 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean183 = false;
		this.aBoolean185 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}
}
