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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt4229;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt4230;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean193;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean194;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean195;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean196;

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean194 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean196 = false;
		this.aBoolean193 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;[BB)Z")
	private boolean method3229(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg1);
			@Pc(16) byte[] local16 = local8.digest();
			if (arg0 == "runescape_-2045244397.pack200") {
				if (local16[0] != -15 || local16[1] != 12 || local16[2] != -58 || local16[3] != -3 || local16[4] != 77 || local16[5] != -32 || local16[6] != 110 || local16[7] != -40 || local16[8] != -61 || local16[9] != -80 || local16[10] != -94 || local16[11] != 21 || local16[12] != -62 || local16[13] != -19 || local16[14] != -25 || local16[15] != 110 || local16[16] != -99 || local16[17] != -17 || local16[18] != 20 || local16[19] != -128) {
					return false;
				}
			} else if (arg0 == "runescape_866574924.js5") {
				if (local16[0] != 46 || local16[1] != -10 || local16[2] != 119 || local16[3] != -127 || local16[4] != -44 || local16[5] != -39 || local16[6] != -32 || local16[7] != 72 || local16[8] != 80 || local16[9] != 90 || local16[10] != -31 || local16[11] != 88 || local16[12] != 16 || local16[13] != -63 || local16[14] != -66 || local16[15] != -41 || local16[16] != -12 || local16[17] != 24 || local16[18] != -53 || local16[19] != -31) {
					return false;
				}
			} else if (arg0 == "unpackclass_-462058432.pack") {
				if (local16[0] != 88 || local16[1] != 0 || local16[2] != -7 || local16[3] != -109 || local16[4] != 43 || local16[5] != -100 || local16[6] != -104 || local16[7] != 7 || local16[8] != -25 || local16[9] != 69 || local16[10] != 28 || local16[11] != 18 || local16[12] != 106 || local16[13] != 112 || local16[14] != 33 || local16[15] != 50 || local16[16] != 123 || local16[17] != -108 || local16[18] != -80 || local16[19] != 35) {
					return false;
				}
			} else if (arg0 == "jogl_181740960.pack") {
				if (local16[0] != 74 || local16[1] != 7 || local16[2] != -54 || local16[3] != 86 || local16[4] != 3 || local16[5] != 113 || local16[6] != -45 || local16[7] != -123 || local16[8] != 63 || local16[9] != 97 || local16[10] != 69 || local16[11] != -41 || local16[12] != -121 || local16[13] != 126 || local16[14] != -30 || local16[15] != -32 || local16[16] != 33 || local16[17] != -122 || local16[18] != -111 || local16[19] != 63) {
					return false;
				}
			} else if (arg0 == "jogl_-1134983286.dll") {
				if (local16[0] != 43 || local16[1] != 73 || local16[2] != -119 || local16[3] != -99 || local16[4] != -19 || local16[5] != 109 || local16[6] != -62 || local16[7] != 40 || local16[8] != 41 || local16[9] != -91 || local16[10] != -88 || local16[11] != -50 || local16[12] != -38 || local16[13] != -127 || local16[14] != -126 || local16[15] != 33 || local16[16] != -93 || local16[17] != -95 || local16[18] != -123 || local16[19] != 66) {
					return false;
				}
			} else if (arg0 == "jogl_awt_-532687481.dll" && (local16[0] != -26 || local16[1] != 91 || local16[2] != -12 || local16[3] != -87 || local16[4] != 122 || local16[5] != -5 || local16[6] != 108 || local16[7] != 94 || local16[8] != 20 || local16[9] != 111 || local16[10] != 116 || local16[11] != -56 || local16[12] != -10 || local16[13] != 66 || local16[14] != -92 || local16[15] != -125 || local16[16] != -41 || local16[17] != 70 || local16[18] != 81 || local16[19] != -71)) {
				return false;
			}
			return true;
		} catch (@Pc(771) Exception local771) {
			this.method3233("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;ILjava/io/File;)[B")
	private byte[] method3230(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) File arg3) {
		@Pc(4) byte[] local4 = this.method3232(arg3);
		if (!this.method3229(arg0, local4)) {
			local4 = this.method3234(arg1, false, arg2, arg0);
			if (local4 == null) {
				local4 = this.method3234(arg1, true, arg2, arg0);
			}
			if (local4 == null) {
				this.method3233("download");
				return null;
			}
			if (!this.method3231(local4, arg3)) {
				return null;
			}
			local4 = this.method3232(arg3);
			if (!this.method3229(arg0, local4)) {
				this.method3233("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/io/File;)Z")
	private boolean method3231(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method3233("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4230 = Integer.parseInt(this.getParameter("width"));
			this.anInt4229 = Integer.parseInt(this.getParameter("height"));
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
			@Pc(53) Class109 local53;
			try {
				local53 = new Class109(true, this, local13, "runescape", 26);
			} catch (@Pc(55) Exception local55) {
				this.method3233("nocache");
				return;
			}
			@Pc(64) ClassLoader_Sub1 local64 = new ClassLoader_Sub1();
			try {
				Class.forName("java.util.jar.Pack200");
				@Pc(69) String local69 = "main_file_cache.dat0";
				@Pc(82) byte[] local82 = this.method3230("runescape_-2045244397.pack200", local26, 334238, new File(local53.aFile4, local69));
				if (local82 == null) {
					return;
				}
				local64.aClass110_1 = new Class110_Sub1(local82);
			} catch (@Pc(94) Throwable local94) {
			}
			if (local64.aClass110_1 == null) {
				@Pc(111) byte[] local111 = this.method3230("unpackclass_-462058432.pack", local28, 19590, new File(local53.aFile4, "game_unpacker.dat"));
				if (local111 == null) {
					return;
				}
				@Pc(119) ClassLoader_Sub1 local119 = new ClassLoader_Sub1();
				local119.aClass110_1 = new Class110(local111);
				@Pc(127) String local127 = "main_file_cache.dat1";
				@Pc(130) Class local130 = Class.forName("Class110");
				local119.aHashtable1.put(local130.getName(), local130);
				@Pc(141) Class local141 = local119.loadClass("unpackclass");
				local111 = this.method3230("runescape_866574924.js5", local26, 335502, new File(local53.aFile4, local127));
				if (local111 == null) {
					return;
				}
				local64.aClass110_1 = (Class110) local141.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local111, Boolean.TRUE);
			}
			@Pc(189) Class local189 = Class.forName("Class112");
			local64.aHashtable1.put(local189.getName(), local189);
			@Pc(199) Class local199 = Class.forName("Class109");
			local64.aHashtable1.put(local199.getName(), local199);
			@Pc(209) Class local209 = Class.forName("Class111");
			local64.aHashtable1.put(local209.getName(), local209);
			@Pc(219) Class local219 = Class.forName("Interface5");
			local64.aHashtable1.put(local219.getName(), local219);
			@Pc(230) Class local230 = local64.loadClass("client");
			synchronized (this) {
				if (this.aBoolean194) {
					return;
				}
				this.anApplet3 = (Applet) local230.getDeclaredConstructor().newInstance();
				local230.getMethod("providesignlink", local199).invoke(null, local53);
				this.anApplet3.init();
				if (this.aBoolean193) {
					this.anApplet3.start();
				}
				if (this.aBoolean196) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(289) Exception local289) {
			RuntimeException_Sub2.anInt4227 = 866574924;
			if (local289 instanceof InvocationTargetException) {
				@Pc(298) Throwable local298 = ((InvocationTargetException) local289).getTargetException();
				if (local298 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3213(local298, this, local289.toString());
			} else {
				RuntimeException_Sub2.method3213(local289, this, null);
			}
			this.method3233("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method3232(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(12) byte[] local12 = new byte[local9];
			@Pc(29) DataInputStream local29 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local29.readFully(local12, 0, local9);
			local29.close();
			return local12;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method3233(@OriginalArg(0) String arg0) {
		if (this.aBoolean195) {
			return;
		}
		this.aBoolean195 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(30) Exception local30) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;BZILjava/lang/String;)[B")
	private byte[] method3234(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg2];
		try {
			@Pc(36) InputStream local36;
			if (arg1) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg3 + "\n\n").getBytes());
				local36 = local49.getInputStream();
			} else {
				local36 = (new URL(this.getCodeBase(), arg3)).openStream();
			}
			@Pc(79) int local79 = 0;
			@Pc(81) int local81 = -1;
			while (local20.length > local79) {
				@Pc(91) int local91 = local20.length - local79;
				if (local91 > 1000) {
					local91 = 1000;
				}
				@Pc(102) int local102 = local36.read(local20, local79, local91);
				if (local102 < 0) {
					throw new EOFException();
				}
				local79 += local102;
				@Pc(119) int local119 = local79 * 100 / local20.length;
				if (local81 != local119) {
					try {
						@Pc(130) Graphics local130 = this.getGraphics();
						if (local130 == null) {
							this.repaint();
						} else {
							local81 = local119;
							local130.setColor(Color.black);
							local130.fillRect(0, 0, this.anInt4230, this.anInt4229);
							local130.setColor(local17);
							local130.drawRect(this.anInt4230 / 2 - 152, this.anInt4229 / 2 + -18, 303, 33);
							local130.setFont(local8);
							@Pc(181) String local181 = arg0 + " - " + local119 + "%";
							local130.setColor(Color.white);
							local130.drawString(local181, (this.anInt4230 - local12.stringWidth(local181)) / 2, this.anInt4229 / 2 + 4);
						}
					} catch (@Pc(207) Exception local207) {
					}
				}
			}
			local36.close();
		} catch (@Pc(213) IOException local213) {
			return null;
		}
		return this.method3229(arg3, local20) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean196 = true;
		this.aBoolean193 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean193 = this.aBoolean196 = false;
		this.aBoolean194 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}
}
