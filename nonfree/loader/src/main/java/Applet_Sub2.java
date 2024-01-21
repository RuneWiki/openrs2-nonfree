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
	private int anInt2983;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Lloader!ve;")
	private Class87 aClass87_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt2984;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean131;

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/lang/String;)Z")
	private boolean method2022(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(16) byte[] local16 = local8.digest();
			if (arg1 == "runescape_-818215370.pack200") {
				if (local16[0] != 93 || local16[1] != 121 || local16[2] != 103 || local16[3] != -123 || local16[4] != 74 || local16[5] != 46 || local16[6] != 124 || local16[7] != 124 || local16[8] != 115 || local16[9] != 97 || local16[10] != -62 || local16[11] != 14 || local16[12] != -3 || local16[13] != -121 || local16[14] != -47 || local16[15] != 66 || local16[16] != -42 || local16[17] != 103 || local16[18] != -81 || local16[19] != -13) {
					return false;
				}
			} else if (arg1 == "runescape_1520282685.js5") {
				if (local16[0] != -53 || local16[1] != 1 || local16[2] != -58 || local16[3] != 122 || local16[4] != 4 || local16[5] != -103 || local16[6] != -10 || local16[7] != 31 || local16[8] != -76 || local16[9] != -97 || local16[10] != 30 || local16[11] != -44 || local16[12] != 79 || local16[13] != 45 || local16[14] != -79 || local16[15] != -68 || local16[16] != -6 || local16[17] != 92 || local16[18] != -57 || local16[19] != 87) {
					return false;
				}
			} else if (local16[0] != 23 || local16[1] != 83 || local16[2] != 57 || local16[3] != 35 || local16[4] != 83 || local16[5] != -48 || local16[6] != 29 || local16[7] != -121 || local16[8] != 101 || local16[9] != 45 || local16[10] != -13 || local16[11] != -62 || local16[12] != -10 || local16[13] != 46 || local16[14] != -57 || local16[15] != -48 || local16[16] != 115 || local16[17] != 102 || local16[18] != 94 || local16[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(404) Exception local404) {
			this.method2026("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;I)[B")
	private byte[] method2023(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(22) Font local22 = new Font("Helvetica", 1, 13);
		@Pc(25) byte[] local25 = new byte[arg2];
		@Pc(29) FontMetrics local29 = this.getFontMetrics(local22);
		@Pc(34) Color local34 = new Color(9179409);
		try {
			@Pc(44) InputStream local44;
			if (arg0) {
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
			while (local89 < local25.length) {
				@Pc(103) int local103 = local25.length - local89;
				if (local103 > 1000) {
					local103 = 1000;
				}
				@Pc(117) int local117 = local44.read(local25, local89, local103);
				if (local117 < 0) {
					throw new EOFException();
				}
				local89 += local117;
				@Pc(138) int local138 = local89 * 100 / local25.length;
				if (local87 != local138) {
					try {
						@Pc(148) Graphics local148 = this.getGraphics();
						if (local148 == null) {
							this.repaint();
						} else {
							local148.setColor(Color.black);
							local87 = local138;
							@Pc(172) String local172 = arg1 + " - " + local138 + "%";
							local148.fillRect(0, 0, this.anInt2984, this.anInt2983);
							local148.setColor(local34);
							local148.drawRect(this.anInt2984 / 2 - 152, this.anInt2983 / 2 + -18, 303, 33);
							local148.setFont(local22);
							local148.setColor(Color.white);
							local148.drawString(local172, (this.anInt2984 - local29.stringWidth(local172)) / 2, this.anInt2983 / 2 + 4);
						}
					} catch (@Pc(224) Exception local224) {
					}
				}
			}
			local44.close();
		} catch (@Pc(230) IOException local230) {
			return null;
		}
		return this.method2022(local25, arg3) ? local25 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/io/File;I)[B")
	private byte[] method2024(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) File arg2, @OriginalArg(4) int arg3) {
		@Pc(4) byte[] local4 = this.method2025(arg2);
		if (!this.method2022(local4, arg0)) {
			local4 = this.method2023(false, arg1, arg3, arg0);
			if (local4 == null) {
				local4 = this.method2023(true, arg1, arg3, arg0);
			}
			if (local4 == null) {
				this.method2026("download");
				return null;
			}
			if (!this.method2027(arg2, local4)) {
				return null;
			}
			local4 = this.method2025(arg2);
			if (!this.method2022(local4, arg0)) {
				this.method2026("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2025(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(22) byte[] local22 = new byte[local8];
			local19.readFully(local22, 0, local8);
			local19.close();
			return local22;
		} catch (@Pc(32) IOException local32) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2026(@OriginalArg(1) String arg0) {
		if (this.aBoolean131) {
			return;
		}
		this.aBoolean131 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(41) Exception local41) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt2984 = Integer.parseInt(this.getParameter("width"));
			this.anInt2983 = Integer.parseInt(this.getParameter("height"));
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
			try {
				this.aClass87_1 = new Class87(true, this, local1, "runescape", 16);
			} catch (@Pc(56) Exception local56) {
				this.method2026("nocache");
				return;
			}
			@Pc(65) ClassLoader_Sub1 local65 = new ClassLoader_Sub1();
			@Pc(84) byte[] local84;
			try {
				Class.forName("java.util.jar.Pack200");
				local84 = this.method2024("runescape_-818215370.pack200", local26, new File(this.aClass87_1.aFile5, "main_file_cache.dat0"), 240392);
				if (local84 == null) {
					return;
				}
				local65.aClass84_1 = new Class84_Sub1(local84);
			} catch (@Pc(97) Throwable local97) {
			}
			@Pc(130) Class local130;
			if (local65.aClass84_1 == null) {
				local84 = this.method2024("unpackclass_-163111980.jar", local28, new File(this.aClass87_1.aFile5, "game_unpacker.dat"), 19185);
				if (local84 == null) {
					return;
				}
				local65.aClass84_1 = new Class84(local84);
				local130 = Class.forName("Class84");
				local65.aHashtable3.put(local130.getName(), local130);
				@Pc(141) Class local141 = local65.loadClass("unpackclass");
				local65 = new ClassLoader_Sub1();
				local84 = this.method2024("runescape_1520282685.js5", local26, new File(this.aClass87_1.aFile5, "main_file_cache.dat1"), 256487);
				if (local84 == null) {
					return;
				}
				local65.aClass84_1 = (Class84) local141.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local84, Boolean.TRUE);
			}
			local130 = Class.forName("Class86");
			local65.aHashtable3.put(local130.getName(), local130);
			@Pc(202) Class local202 = Class.forName("Class87");
			local65.aHashtable3.put(local202.getName(), local202);
			local130 = Class.forName("Class85");
			local65.aHashtable3.put(local130.getName(), local130);
			local130 = Class.forName("Interface4");
			local65.aHashtable3.put(local130.getName(), local130);
			local130 = local65.loadClass("client");
			this.anApplet2 = (Applet) local130.getDeclaredConstructor().newInstance();
			local130.getMethod("providesignlink", local202).invoke(null, this.aClass87_1);
			this.anApplet2.init();
			this.anApplet2.start();
		} catch (@Pc(265) Exception local265) {
			RuntimeException_Sub2.anInt2978 = 1520282685;
			if (local265 instanceof InvocationTargetException) {
				@Pc(274) Throwable local274 = ((InvocationTargetException) local265).getTargetException();
				if (local274 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2013(local274, this, local265.toString());
			} else {
				RuntimeException_Sub2.method2013(local265, this, null);
			}
			this.method2026("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method2027(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method2026("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}
}
