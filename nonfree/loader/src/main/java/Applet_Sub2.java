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
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt3161;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Lloader!we;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt3162;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean139;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2183(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(14) int local14 = (int) arg0.length();
			@Pc(25) DataInputStream local25 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local14];
			local25.readFully(local28, 0, local14);
			local25.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BB)Z")
	private boolean method2184(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method2188("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IBZLjava/lang/String;)[B")
	private byte[] method2185(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(31) Color local31 = new Color(9179409);
		@Pc(34) byte[] local34 = new byte[arg1];
		try {
			@Pc(44) InputStream local44;
			if (arg2) {
				@Pc(49) URL local49 = this.getCodeBase();
				@Pc(57) Socket local57 = new Socket(InetAddress.getByName(local49.getHost()), 443);
				local57.setSoTimeout(10000);
				@Pc(63) OutputStream local63 = local57.getOutputStream();
				local63.write(17);
				local63.write(("JAGGRAB " + local49.getFile() + arg3 + "\n\n").getBytes());
				local44 = local57.getInputStream();
			} else {
				local44 = (new URL(this.getCodeBase(), arg3)).openStream();
			}
			@Pc(87) int local87 = -1;
			@Pc(89) int local89 = 0;
			while (local34.length > local89) {
				@Pc(103) int local103 = local34.length - local89;
				if (local103 > 1000) {
					local103 = 1000;
				}
				@Pc(117) int local117 = local44.read(local34, local89, local103);
				if (local117 < 0) {
					throw new EOFException();
				}
				local89 += local117;
				@Pc(138) int local138 = local89 * 100 / local34.length;
				if (local138 != local87) {
					try {
						@Pc(148) Graphics local148 = this.getGraphics();
						if (local148 == null) {
							this.repaint();
						} else {
							local87 = local138;
							@Pc(166) String local166 = arg0 + " - " + local138 + "%";
							local148.setColor(Color.black);
							local148.fillRect(0, 0, this.anInt3161, this.anInt3162);
							local148.setColor(local31);
							local148.drawRect(this.anInt3161 / 2 - 152, this.anInt3162 / 2 - 18, 303, 33);
							local148.setFont(local8);
							local148.setColor(Color.white);
							local148.drawString(local166, (this.anInt3161 - local12.stringWidth(local166)) / 2, this.anInt3162 / 2 + 4);
						}
					} catch (@Pc(226) Exception local226) {
					}
				}
			}
			local44.close();
		} catch (@Pc(232) IOException local232) {
			return null;
		}
		return this.method2186(local34, arg3) ? local34 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/lang/String;)Z")
	private boolean method2186(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg0);
			@Pc(15) byte[] local15 = local7.digest();
			if (arg1 == "runescape.pack200?crc=1385865898") {
				if (local15[0] != 62 || local15[1] != 59 || local15[2] != -121 || local15[3] != -13 || local15[4] != -31 || local15[5] != 109 || local15[6] != -44 || local15[7] != -77 || local15[8] != -56 || local15[9] != -18 || local15[10] != -111 || local15[11] != 34 || local15[12] != -55 || local15[13] != -102 || local15[14] != -26 || local15[15] != -59 || local15[16] != -82 || local15[17] != -95 || local15[18] != -16 || local15[19] != -101) {
					return false;
				}
			} else if (arg1 == "runescape.js5?crc=1617141410") {
				if (local15[0] != 60 || local15[1] != 69 || local15[2] != 7 || local15[3] != -85 || local15[4] != 100 || local15[5] != 112 || local15[6] != -6 || local15[7] != -103 || local15[8] != -68 || local15[9] != 46 || local15[10] != -74 || local15[11] != 98 || local15[12] != 57 || local15[13] != 48 || local15[14] != -84 || local15[15] != -89 || local15[16] != -89 || local15[17] != 73 || local15[18] != -62 || local15[19] != 121) {
					return false;
				}
			} else if (local15[0] != 3 || local15[1] != -21 || local15[2] != 65 || local15[3] != -60 || local15[4] != -33 || local15[5] != -24 || local15[6] != 92 || local15[7] != 4 || local15[8] != -2 || local15[9] != 48 || local15[10] != 106 || local15[11] != 50 || local15[12] != -46 || local15[13] != -31 || local15[14] != -44 || local15[15] != 120 || local15[16] != -104 || local15[17] != 72 || local15[18] != 50 || local15[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(403) Exception local403) {
			this.method2188("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ILjava/io/File;ILjava/lang/String;)[B")
	private byte[] method2187(@OriginalArg(0) String arg0, @OriginalArg(2) File arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = this.method2183(arg1);
		if (!this.method2186(local4, arg0)) {
			local4 = this.method2185(arg3, arg2, false, arg0);
			if (local4 == null) {
				local4 = this.method2185(arg3, arg2, true, arg0);
			}
			if (local4 == null) {
				this.method2188("download");
				return null;
			}
			if (!this.method2184(arg1, local4)) {
				return null;
			}
			local4 = this.method2183(arg1);
			if (!this.method2186(local4, arg0)) {
				this.method2188("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3161 = Integer.parseInt(this.getParameter("width"));
			this.anInt3162 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(45) Exception local45) {
			}
			try {
				this.aClass81_1 = new Class81(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local13, "runescape", 16);
			} catch (@Pc(61) Exception local61) {
				this.method2188("nocache");
				return;
			}
			@Pc(72) ClassLoader_Sub1 local72 = new ClassLoader_Sub1();
			@Pc(89) byte[] local89;
			try {
				Class.forName("java.util.jar.Pack200");
				local89 = this.method2187("runescape.pack200?crc=1385865898", new File(this.aClass81_1.aFile6, "main_file_cache.dat0"), 234039, local26);
				if (local89 == null) {
					return;
				}
				local72.aClass78_1 = new Class78_Sub1(local89);
			} catch (@Pc(101) Throwable local101) {
			}
			@Pc(132) Class local132;
			if (local72.aClass78_1 == null) {
				local89 = this.method2187("unpackclass.jar?crc=-549807395", new File(this.aClass81_1.aFile6, "game_unpacker.dat"), 17836, local28);
				if (local89 == null) {
					return;
				}
				local72.aClass78_1 = new Class78(local89);
				local132 = Class.forName("Class78");
				local72.aHashtable1.put(local132.getName(), local132);
				@Pc(143) Class local143 = local72.loadClass("unpackclass");
				local72 = new ClassLoader_Sub1();
				local89 = this.method2187("runescape.js5?crc=1617141410", new File(this.aClass81_1.aFile6, "main_file_cache.dat1"), 249633, local26);
				if (local89 == null) {
					return;
				}
				local72.aClass78_1 = (Class78) local143.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local89, Boolean.TRUE);
			}
			local132 = Class.forName("Class80");
			local72.aHashtable1.put(local132.getName(), local132);
			@Pc(206) Class local206 = Class.forName("Class81");
			local72.aHashtable1.put(local206.getName(), local206);
			local132 = Class.forName("Class79");
			local72.aHashtable1.put(local132.getName(), local132);
			local132 = Class.forName("Interface4");
			local72.aHashtable1.put(local132.getName(), local132);
			local132 = local72.loadClass("client");
			this.anApplet2 = (Applet) local132.getDeclaredConstructor().newInstance();
			local132.getMethod("providesignlink", local206).invoke(null, this.aClass81_1);
			this.anApplet2.init();
			this.anApplet2.start();
		} catch (@Pc(269) Exception local269) {
			RuntimeException_Sub2.anInt3160 = 1617141410;
			if (local269 instanceof InvocationTargetException) {
				@Pc(278) Throwable local278 = ((InvocationTargetException) local269).getTargetException();
				if (local278 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2171(local278, this, local269.toString());
			} else {
				RuntimeException_Sub2.method2171(local269, this, null);
			}
			this.method2188("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method2188(@OriginalArg(0) String arg0) {
		if (this.aBoolean139) {
			return;
		}
		this.aBoolean139 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(32) Exception local32) {
		}
	}
}
