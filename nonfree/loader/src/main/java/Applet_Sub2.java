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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Lloader!ed;")
	private Class72 aClass72_1;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt3012;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt3013;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean164;

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILjava/lang/String;ILjava/lang/String;)[B")
	private byte[] method1998(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(11) byte[] local11 = new byte[arg1];
		@Pc(15) FontMetrics local15 = this.getFontMetrics(local8);
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(67) InputStream local67;
			if (arg0) {
				@Pc(31) URL local31 = this.getCodeBase();
				@Pc(39) Socket local39 = new Socket(InetAddress.getByName(local31.getHost()), 443);
				local39.setSoTimeout(10000);
				@Pc(45) OutputStream local45 = local39.getOutputStream();
				local45.write(17);
				local45.write(("JAGGRAB " + local31.getFile() + arg2 + "\n\n").getBytes());
				local67 = local39.getInputStream();
			} else {
				local67 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = 0;
			while (local81 < local11.length) {
				@Pc(90) int local90 = local11.length - local81;
				if (local90 > 1000) {
					local90 = 1000;
				}
				@Pc(105) int local105 = local67.read(local11, local81, local90);
				if (local105 < 0) {
					throw new EOFException();
				}
				local81 += local105;
				@Pc(122) int local122 = local81 * 100 / local11.length;
				if (local122 != local79) {
					try {
						@Pc(128) Graphics local128 = this.getGraphics();
						if (local128 == null) {
							this.repaint();
						} else {
							local128.setColor(Color.black);
							local128.fillRect(0, 0, this.anInt3013, this.anInt3012);
							@Pc(155) String local155 = arg3 + " - " + local122 + "%";
							local79 = local122;
							local128.setColor(local20);
							local128.drawRect(this.anInt3013 / 2 - 152, this.anInt3012 / 2 + -18, 303, 33);
							local128.setFont(local8);
							local128.setColor(Color.white);
							local128.drawString(local155, (this.anInt3013 - local15.stringWidth(local155)) / 2, this.anInt3012 / 2 + 4);
						}
					} catch (@Pc(205) Exception local205) {
					}
				}
			}
			local67.close();
		} catch (@Pc(211) IOException local211) {
			return null;
		}
		return this.method1999(arg2, local11) ? local11 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;[BI)Z")
	private boolean method1999(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(16) MessageDigest local16 = MessageDigest.getInstance("SHA");
			local16.reset();
			local16.update(arg1);
			@Pc(24) byte[] local24 = local16.digest();
			if (arg0 == "runescape.pack200?crc=659878644") {
				if (local24[0] != 109 || local24[1] != -114 || local24[2] != 42 || local24[3] != -12 || local24[4] != 91 || local24[5] != -62 || local24[6] != 114 || local24[7] != -106 || local24[8] != 35 || local24[9] != 44 || local24[10] != 11 || local24[11] != -91 || local24[12] != 0 || local24[13] != 106 || local24[14] != -71 || local24[15] != -76 || local24[16] != -28 || local24[17] != -80 || local24[18] != 99 || local24[19] != 41) {
					return false;
				}
			} else if (arg0 == "runescape.js5?crc=-896560011") {
				if (local24[0] != 31 || local24[1] != -44 || local24[2] != 68 || local24[3] != -73 || local24[4] != 8 || local24[5] != -112 || local24[6] != -38 || local24[7] != -107 || local24[8] != -6 || local24[9] != -108 || local24[10] != 61 || local24[11] != 63 || local24[12] != 124 || local24[13] != 108 || local24[14] != -82 || local24[15] != 78 || local24[16] != -128 || local24[17] != 68 || local24[18] != -47 || local24[19] != -38) {
					return false;
				}
			} else if (local24[0] != 3 || local24[1] != -21 || local24[2] != 65 || local24[3] != -60 || local24[4] != -33 || local24[5] != -24 || local24[6] != 92 || local24[7] != 4 || local24[8] != -2 || local24[9] != 48 || local24[10] != 106 || local24[11] != 50 || local24[12] != -46 || local24[13] != -31 || local24[14] != -44 || local24[15] != 120 || local24[16] != -104 || local24[17] != 72 || local24[18] != 50 || local24[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(405) Exception local405) {
			this.method2002("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BILjava/io/File;)[B")
	private byte[] method2000(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) File arg3) {
		@Pc(6) byte[] local6 = this.method2001(arg3);
		if (!this.method1999(arg1, local6)) {
			local6 = this.method1998(false, arg2, arg1, arg0);
			if (local6 == null) {
				local6 = this.method1998(true, arg2, arg1, arg0);
			}
			if (local6 == null) {
				this.method2002("download");
				return null;
			}
			if (!this.method2003(arg3, local6)) {
				return null;
			}
			local6 = this.method2001(arg3);
			if (!this.method1999(arg1, local6)) {
				this.method2002("mismatch");
				return null;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;)[B")
	private byte[] method2001(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method2002(@OriginalArg(1) String arg0) {
		if (this.aBoolean164) {
			return;
		}
		this.aBoolean164 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method2003(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method2002("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3013 = Integer.parseInt(this.getParameter("width"));
			@Pc(9) int local9 = 32;
			this.anInt3012 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local9 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			@Pc(28) String local28 = "Loading unpacker";
			@Pc(30) String local30 = "Loading game code";
			try {
				@Pc(34) String local34 = this.getParameter("lang");
				if (local34 != null && local34.equals("1")) {
					local30 = "Lade Spiel-Code";
					local28 = "Lade Entpacker";
				}
			} catch (@Pc(48) Exception local48) {
			}
			try {
				this.aClass72_1 = new Class72(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local9, "runescape", 14);
			} catch (@Pc(64) Exception local64) {
				this.method2002("nocache");
				return;
			}
			@Pc(73) ClassLoader_Sub1 local73 = new ClassLoader_Sub1();
			@Pc(92) byte[] local92;
			try {
				Class.forName("java.util.jar.Pack200");
				local92 = this.method2000(local30, "runescape.pack200?crc=659878644", 216140, new File(this.aClass72_1.aString16, "main_file_cache.dat0"));
				if (local92 == null) {
					return;
				}
				local73.aClass71_1 = new Class71_Sub1(local92);
			} catch (@Pc(104) Throwable local104) {
			}
			@Pc(137) Class local137;
			if (local73.aClass71_1 == null) {
				local92 = this.method2000(local28, "unpackclass.jar?crc=-549807395", 17836, new File(this.aClass72_1.aString16, "shared_game_unpacker.dat"));
				if (local92 == null) {
					return;
				}
				local73.aClass71_1 = new Class71(local92);
				local137 = Class.forName("Class71");
				local73.aHashtable1.put(local137.getName(), local137);
				@Pc(148) Class local148 = local73.loadClass("unpackclass");
				local73 = new ClassLoader_Sub1();
				local92 = this.method2000(local30, "runescape.js5?crc=-896560011", 232966, new File(this.aClass72_1.aString16, "main_file_cache.dat1"));
				if (local92 == null) {
					return;
				}
				local73.aClass71_1 = (Class71) local148.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local92, Boolean.TRUE);
			}
			local137 = Class.forName("Class70");
			local73.aHashtable1.put(local137.getName(), local137);
			@Pc(212) Class local212 = Class.forName("Class72");
			local73.aHashtable1.put(local212.getName(), local212);
			local137 = Class.forName("Class73");
			local73.aHashtable1.put(local137.getName(), local137);
			local137 = Class.forName("Interface6");
			local73.aHashtable1.put(local137.getName(), local137);
			local137 = Class.forName("Interface5");
			local73.aHashtable1.put(local137.getName(), local137);
			local137 = local73.loadClass("client");
			this.anApplet3 = (Applet) local137.getDeclaredConstructor().newInstance();
			local137.getMethod("providesignlink", local212).invoke(null, this.aClass72_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(285) Exception local285) {
			RuntimeException_Sub2.anInt3008 = -896560011;
			if (local285 instanceof InvocationTargetException) {
				@Pc(294) Throwable local294 = ((InvocationTargetException) local285).getTargetException();
				if (local294 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method1973(local294, this, local285.toString());
			} else {
				RuntimeException_Sub2.method1973(local285, this, null);
			}
			this.method2002("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}
}
