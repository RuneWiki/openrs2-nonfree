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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Lloader!g;")
	private Class74 aClass74_1;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt2887;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt2888;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean174;

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt2888 = Integer.parseInt(this.getParameter("width"));
			this.anInt2887 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(45) Exception local45) {
			}
			try {
				this.aClass74_1 = new Class74(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local1, "runescape", 14);
			} catch (@Pc(61) Exception local61) {
				this.method2140("nocache");
				return;
			}
			@Pc(72) ClassLoader_Sub1 local72 = new ClassLoader_Sub1();
			@Pc(89) byte[] local89;
			try {
				Class.forName("java.util.jar.Pack200");
				local89 = this.method2137(local26, "runescape.pack200?crc=1318500858", new File(this.aClass74_1.aFile4, "main_file_cache.dat0"), 222426);
				if (local89 == null) {
					return;
				}
				local72.aClass73_1 = new Class73_Sub1(local89);
			} catch (@Pc(101) Throwable local101) {
			}
			@Pc(132) Class local132;
			if (local72.aClass73_1 == null) {
				local89 = this.method2137(local28, "unpackclass.jar?crc=-549807395", new File(this.aClass74_1.aFile4, "game_unpacker.dat"), 17836);
				if (local89 == null) {
					return;
				}
				local72.aClass73_1 = new Class73(local89);
				local132 = Class.forName("Class73");
				local72.aHashtable3.put(local132.getName(), local132);
				@Pc(143) Class local143 = local72.loadClass("unpackclass");
				local72 = new ClassLoader_Sub1();
				local89 = this.method2137(local26, "runescape.js5?crc=1530663930", new File(this.aClass74_1.aFile4, "main_file_cache.dat1"), 238494);
				if (local89 == null) {
					return;
				}
				local72.aClass73_1 = (Class73) local143.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local89, Boolean.TRUE);
			}
			local132 = Class.forName("Class76");
			local72.aHashtable3.put(local132.getName(), local132);
			@Pc(204) Class local204 = Class.forName("Class74");
			local72.aHashtable3.put(local204.getName(), local204);
			local132 = Class.forName("Class75");
			local72.aHashtable3.put(local132.getName(), local132);
			local132 = Class.forName("Interface5");
			local72.aHashtable3.put(local132.getName(), local132);
			local132 = Class.forName("Interface6");
			local72.aHashtable3.put(local132.getName(), local132);
			local132 = local72.loadClass("client");
			this.anApplet3 = (Applet) local132.getDeclaredConstructor().newInstance();
			local132.getMethod("providesignlink", local204).invoke(null, this.aClass74_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(277) Exception local277) {
			RuntimeException_Sub2.anInt2883 = 1530663930;
			if (local277 instanceof InvocationTargetException) {
				@Pc(293) Throwable local293 = ((InvocationTargetException) local277).getTargetException();
				if (local293 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2112(local293, local277.toString(), this);
			} else {
				RuntimeException_Sub2.method2112(local277, null, this);
			}
			this.method2140("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZZI)[B")
	private byte[] method2136(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Font local17 = new Font("Helvetica", 1, 13);
		@Pc(21) FontMetrics local21 = this.getFontMetrics(local17);
		@Pc(26) Color local26 = new Color(9179409);
		@Pc(29) byte[] local29 = new byte[arg3];
		try {
			@Pc(39) InputStream local39;
			if (arg2) {
				@Pc(44) URL local44 = this.getCodeBase();
				@Pc(52) Socket local52 = new Socket(InetAddress.getByName(local44.getHost()), 443);
				local52.setSoTimeout(10000);
				@Pc(58) OutputStream local58 = local52.getOutputStream();
				local58.write(17);
				local58.write(("JAGGRAB " + local44.getFile() + arg0 + "\n\n").getBytes());
				local39 = local52.getInputStream();
			} else {
				local39 = (new URL(this.getCodeBase(), arg0)).openStream();
			}
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = 0;
			while (local29.length > local84) {
				@Pc(94) int local94 = local29.length - local84;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(106) int local106 = local39.read(local29, local84, local94);
				if (local106 < 0) {
					throw new EOFException();
				}
				local84 += local106;
				@Pc(124) int local124 = local84 * 100 / local29.length;
				if (local82 != local124) {
					try {
						@Pc(135) Graphics local135 = this.getGraphics();
						if (local135 == null) {
							this.repaint();
						} else {
							local135.setColor(Color.black);
							@Pc(157) String local157 = arg1 + " - " + local124 + "%";
							local82 = local124;
							local135.fillRect(0, 0, this.anInt2888, this.anInt2887);
							local135.setColor(local26);
							local135.drawRect(this.anInt2888 / 2 - 152, this.anInt2887 / 2 + -18, 303, 33);
							local135.setFont(local17);
							local135.setColor(Color.white);
							local135.drawString(local157, (this.anInt2888 - local21.stringWidth(local157)) / 2, this.anInt2887 / 2 + 4);
						}
					} catch (@Pc(211) Exception local211) {
					}
				}
			}
			local39.close();
		} catch (@Pc(217) IOException local217) {
			return null;
		}
		return this.method2138(local29, arg0) ? local29 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;II)[B")
	private byte[] method2137(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) File arg2, @OriginalArg(4) int arg3) {
		@Pc(4) byte[] local4 = this.method2141(arg2);
		if (!this.method2138(local4, arg1)) {
			local4 = this.method2136(arg1, arg0, false, arg3);
			if (local4 == null) {
				local4 = this.method2136(arg1, arg0, true, arg3);
			}
			if (local4 == null) {
				this.method2140("download");
				return null;
			}
			if (!this.method2139(arg2, local4)) {
				return null;
			}
			local4 = this.method2141(arg2);
			if (!this.method2138(local4, arg1)) {
				this.method2140("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/lang/String;)Z")
	private boolean method2138(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(21) byte[] local21 = local8.digest();
			if (arg1 == "runescape.pack200?crc=1318500858") {
				if (local21[0] != -23 || local21[1] != -12 || local21[2] != 38 || local21[3] != 91 || local21[4] != -44 || local21[5] != -23 || local21[6] != 95 || local21[7] != -1 || local21[8] != -12 || local21[9] != 58 || local21[10] != -108 || local21[11] != -106 || local21[12] != -119 || local21[13] != -84 || local21[14] != -8 || local21[15] != 88 || local21[16] != 38 || local21[17] != -101 || local21[18] != -49 || local21[19] != -48) {
					return false;
				}
			} else if (arg1 == "runescape.js5?crc=1530663930") {
				if (local21[0] != -40 || local21[1] != -60 || local21[2] != -80 || local21[3] != -11 || local21[4] != -122 || local21[5] != 102 || local21[6] != 48 || local21[7] != 121 || local21[8] != 60 || local21[9] != -92 || local21[10] != 54 || local21[11] != -43 || local21[12] != 34 || local21[13] != 60 || local21[14] != -110 || local21[15] != 57 || local21[16] != 37 || local21[17] != 80 || local21[18] != -68 || local21[19] != -16) {
					return false;
				}
			} else if (local21[0] != 3 || local21[1] != -21 || local21[2] != 65 || local21[3] != -60 || local21[4] != -33 || local21[5] != -24 || local21[6] != 92 || local21[7] != 4 || local21[8] != -2 || local21[9] != 48 || local21[10] != 106 || local21[11] != 50 || local21[12] != -46 || local21[13] != -31 || local21[14] != -44 || local21[15] != 120 || local21[16] != -104 || local21[17] != 72 || local21[18] != 50 || local21[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(401) Exception local401) {
			this.method2140("sha");
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

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method2139(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(8) FileOutputStream local8 = new FileOutputStream(arg0);
			local8.write(arg1, 0, arg1.length);
			local8.close();
			return true;
		} catch (@Pc(19) IOException local19) {
			this.method2140("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method2140(@OriginalArg(0) String arg0) {
		if (this.aBoolean174) {
			return;
		}
		this.aBoolean174 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(36) Exception local36) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2141(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(14) int local14 = (int) arg0.length();
			@Pc(17) byte[] local17 = new byte[local14];
			@Pc(28) DataInputStream local28 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local28.readFully(local17, 0, local14);
			local28.close();
			return local17;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}
}
