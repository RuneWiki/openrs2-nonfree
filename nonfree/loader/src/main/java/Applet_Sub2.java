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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt4514;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt4515;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean181;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean182;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean184;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean183;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method3186(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method3190("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;IZ)[B")
	private byte[] method3187(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(16) byte[] local16 = new byte[arg3];
		@Pc(20) FontMetrics local20 = this.getFontMetrics(local8);
		@Pc(25) Color local25 = new Color(9179409);
		try {
			@Pc(66) InputStream local66;
			if (arg1) {
				@Pc(30) URL local30 = this.getCodeBase();
				@Pc(38) Socket local38 = new Socket(InetAddress.getByName(local30.getHost()), 443);
				local38.setSoTimeout(10000);
				@Pc(44) OutputStream local44 = local38.getOutputStream();
				local44.write(17);
				local44.write(("JAGGRAB " + local30.getFile() + arg2 + "\n\n").getBytes());
				local66 = local38.getInputStream();
			} else {
				local66 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = 0;
			while (local16.length > local80) {
				@Pc(94) int local94 = local16.length - local80;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(108) int local108 = local66.read(local16, local80, local94);
				if (local108 < 0) {
					throw new EOFException();
				}
				local80 += local108;
				@Pc(128) int local128 = local80 * 100 / local16.length;
				if (local78 != local128) {
					try {
						@Pc(134) Graphics local134 = this.getGraphics();
						if (local134 == null) {
							this.repaint();
						} else {
							local78 = local128;
							@Pc(156) String local156 = arg0 + " - " + local128 + "%";
							local134.setColor(Color.black);
							local134.fillRect(0, 0, this.anInt4515, this.anInt4514);
							local134.setColor(local25);
							local134.drawRect(this.anInt4515 / 2 - 152, this.anInt4514 / 2 - 18, 303, 33);
							local134.setFont(local8);
							local134.setColor(Color.white);
							local134.drawString(local156, (this.anInt4515 - local20.stringWidth(local156)) / 2, this.anInt4514 / 2 + 4);
						}
					} catch (@Pc(212) Exception local212) {
					}
				}
			}
			local66.close();
		} catch (@Pc(218) IOException local218) {
			return null;
		}
		return this.method3189(arg2, local16) ? local16 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;IB)[B")
	private byte[] method3188(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) File arg2, @OriginalArg(3) int arg3) {
		@Pc(4) byte[] local4 = this.method3191(arg2);
		if (!this.method3189(arg0, local4)) {
			local4 = this.method3187(arg1, false, arg0, arg3);
			if (local4 == null) {
				local4 = this.method3187(arg1, true, arg0, arg3);
			}
			if (local4 == null) {
				this.method3190("download");
				return null;
			}
			if (!this.method3186(local4, arg2)) {
				return null;
			}
			local4 = this.method3191(arg2);
			if (!this.method3189(arg0, local4)) {
				this.method3190("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean184 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean181 = true;
		this.aBoolean182 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;[BB)Z")
	private boolean method3189(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(16) MessageDigest local16 = MessageDigest.getInstance("SHA");
			local16.reset();
			local16.update(arg1);
			@Pc(24) byte[] local24 = local16.digest();
			if (arg0 == "runescape_-341598973.pack200") {
				if (local24[0] != -128 || local24[1] != -107 || local24[2] != 127 || local24[3] != -122 || local24[4] != 116 || local24[5] != -62 || local24[6] != 73 || local24[7] != 61 || local24[8] != 45 || local24[9] != -112 || local24[10] != -90 || local24[11] != 110 || local24[12] != -115 || local24[13] != 47 || local24[14] != -34 || local24[15] != 32 || local24[16] != -118 || local24[17] != -93 || local24[18] != -91 || local24[19] != -98) {
					return false;
				}
			} else if (arg0 == "runescape_-1133573276.js5") {
				if (local24[0] != -100 || local24[1] != 31 || local24[2] != 13 || local24[3] != -127 || local24[4] != 2 || local24[5] != -49 || local24[6] != 18 || local24[7] != 81 || local24[8] != -6 || local24[9] != 51 || local24[10] != -38 || local24[11] != -105 || local24[12] != 113 || local24[13] != -104 || local24[14] != -18 || local24[15] != 4 || local24[16] != -124 || local24[17] != 124 || local24[18] != 107 || local24[19] != -91) {
					return false;
				}
			} else if (arg0 == "unpackclass_-163111980.pack") {
				if (local24[0] != 23 || local24[1] != 83 || local24[2] != 57 || local24[3] != 35 || local24[4] != 83 || local24[5] != -48 || local24[6] != 29 || local24[7] != -121 || local24[8] != 101 || local24[9] != 45 || local24[10] != -13 || local24[11] != -62 || local24[12] != -10 || local24[13] != 46 || local24[14] != -57 || local24[15] != -48 || local24[16] != 115 || local24[17] != 102 || local24[18] != 94 || local24[19] != 95) {
					return false;
				}
			} else if (arg0 == "jogl_181740960.pack") {
				if (local24[0] != 74 || local24[1] != 7 || local24[2] != -54 || local24[3] != 86 || local24[4] != 3 || local24[5] != 113 || local24[6] != -45 || local24[7] != -123 || local24[8] != 63 || local24[9] != 97 || local24[10] != 69 || local24[11] != -41 || local24[12] != -121 || local24[13] != 126 || local24[14] != -30 || local24[15] != -32 || local24[16] != 33 || local24[17] != -122 || local24[18] != -111 || local24[19] != 63) {
					return false;
				}
			} else if (arg0 == "jogl_-1134983286.dll") {
				if (local24[0] != 43 || local24[1] != 73 || local24[2] != -119 || local24[3] != -99 || local24[4] != -19 || local24[5] != 109 || local24[6] != -62 || local24[7] != 40 || local24[8] != 41 || local24[9] != -91 || local24[10] != -88 || local24[11] != -50 || local24[12] != -38 || local24[13] != -127 || local24[14] != -126 || local24[15] != 33 || local24[16] != -93 || local24[17] != -95 || local24[18] != -123 || local24[19] != 66) {
					return false;
				}
			} else if (arg0 == "jogl_awt_-532687481.dll" && (local24[0] != -26 || local24[1] != 91 || local24[2] != -12 || local24[3] != -87 || local24[4] != 122 || local24[5] != -5 || local24[6] != 108 || local24[7] != 94 || local24[8] != 20 || local24[9] != 111 || local24[10] != 116 || local24[11] != -56 || local24[12] != -10 || local24[13] != 66 || local24[14] != -92 || local24[15] != -125 || local24[16] != -41 || local24[17] != 70 || local24[18] != 81 || local24[19] != -71)) {
				return false;
			}
			return true;
		} catch (@Pc(779) Exception local779) {
			this.method3190("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method3190(@OriginalArg(0) String arg0) {
		if (this.aBoolean183) {
			return;
		}
		this.aBoolean183 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(35) Exception local35) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean181 = false;
		this.aBoolean182 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4515 = Integer.parseInt(this.getParameter("width"));
			@Pc(7) int local7 = 32;
			this.anInt4514 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local7 += local18;
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
			} catch (@Pc(45) Exception local45) {
			}
			@Pc(54) Class96 local54;
			try {
				local54 = new Class96(true, this, local7, "runescape", 23);
			} catch (@Pc(56) Exception local56) {
				this.method3190("nocache");
				return;
			}
			@Pc(65) ClassLoader_Sub1 local65 = new ClassLoader_Sub1();
			try {
				Class.forName("java.util.jar.Pack200");
				@Pc(70) String local70 = "main_file_cache.dat0";
				@Pc(83) byte[] local83 = this.method3188("runescape_-341598973.pack200", local26, new File(local54.aFile5, local70), 294963);
				if (local83 == null) {
					return;
				}
				local65.aClass95_1 = new Class95_Sub1(local83);
			} catch (@Pc(95) Throwable local95) {
			}
			if (local65.aClass95_1 == null) {
				@Pc(111) byte[] local111 = this.method3188("unpackclass_-163111980.pack", local28, new File(local54.aFile5, "game_unpacker.dat"), 19185);
				if (local111 == null) {
					return;
				}
				@Pc(119) ClassLoader_Sub1 local119 = new ClassLoader_Sub1();
				@Pc(121) String local121 = "main_file_cache.dat1";
				local119.aClass95_1 = new Class95(local111);
				@Pc(130) Class local130 = Class.forName("Class95");
				local119.aHashtable3.put(local130.getName(), local130);
				@Pc(141) Class local141 = local119.loadClass("unpackclass");
				local111 = this.method3188("runescape_-1133573276.js5", local26, new File(local54.aFile5, local121), 304746);
				if (local111 == null) {
					return;
				}
				local65.aClass95_1 = (Class95) local141.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local111, Boolean.TRUE);
			}
			@Pc(188) Class local188 = Class.forName("Class97");
			local65.aHashtable3.put(local188.getName(), local188);
			@Pc(198) Class local198 = Class.forName("Class96");
			local65.aHashtable3.put(local198.getName(), local198);
			@Pc(208) Class local208 = Class.forName("Class98");
			local65.aHashtable3.put(local208.getName(), local208);
			@Pc(218) Class local218 = Class.forName("Interface4");
			local65.aHashtable3.put(local218.getName(), local218);
			@Pc(229) Class local229 = local65.loadClass("client");
			synchronized (this) {
				if (this.aBoolean184) {
					return;
				}
				this.anApplet2 = (Applet) local229.getDeclaredConstructor().newInstance();
				local229.getMethod("providesignlink", local198).invoke(null, local54);
				this.anApplet2.init();
				if (this.aBoolean181) {
					this.anApplet2.start();
				}
				if (this.aBoolean182) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(290) Exception local290) {
			RuntimeException_Sub2.anInt4513 = -1133573276;
			if (local290 instanceof InvocationTargetException) {
				@Pc(306) Throwable local306 = ((InvocationTargetException) local290).getTargetException();
				if (local306 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3184(local306, local290.toString(), this);
			} else {
				RuntimeException_Sub2.method3184(local290, null, this);
			}
			this.method3190("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean181 = this.aBoolean182 = false;
		this.aBoolean184 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Z)[B")
	private byte[] method3191(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(15) int local15 = (int) arg0.length();
			@Pc(18) byte[] local18 = new byte[local15];
			@Pc(29) DataInputStream local29 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local29.readFully(local18, 0, local15);
			local29.close();
			return local18;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}
}
