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
	private int anInt2988;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!df;")
	private Class86 aClass86_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt2989;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean134;

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2132(@OriginalArg(1) String arg0) {
		if (this.aBoolean134) {
			return;
		}
		this.aBoolean134 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method2133(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method2132("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZBLjava/lang/String;ILjava/lang/String;)[B")
	private byte[] method2134(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = new byte[arg2];
		@Pc(11) Font local11 = new Font("Helvetica", 1, 13);
		@Pc(15) FontMetrics local15 = this.getFontMetrics(local11);
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(69) InputStream local69;
			if (arg0) {
				@Pc(33) URL local33 = this.getCodeBase();
				@Pc(41) Socket local41 = new Socket(InetAddress.getByName(local33.getHost()), 443);
				local41.setSoTimeout(10000);
				@Pc(47) OutputStream local47 = local41.getOutputStream();
				local47.write(17);
				local47.write(("JAGGRAB " + local33.getFile() + arg3 + "\n\n").getBytes());
				local69 = local41.getInputStream();
			} else {
				local69 = (new URL(this.getCodeBase(), arg3)).openStream();
			}
			@Pc(81) int local81 = 0;
			@Pc(83) int local83 = -1;
			while (local81 < local4.length) {
				@Pc(96) int local96 = local4.length - local81;
				if (local96 > 1000) {
					local96 = 1000;
				}
				@Pc(110) int local110 = local69.read(local4, local81, local96);
				if (local110 < 0) {
					throw new EOFException();
				}
				local81 += local110;
				@Pc(127) int local127 = local81 * 100 / local4.length;
				if (local127 != local83) {
					try {
						@Pc(138) Graphics local138 = this.getGraphics();
						if (local138 == null) {
							this.repaint();
						} else {
							local138.setColor(Color.black);
							local138.fillRect(0, 0, this.anInt2988, this.anInt2989);
							local138.setColor(local20);
							@Pc(168) String local168 = arg1 + " - " + local127 + "%";
							local83 = local127;
							local138.drawRect(this.anInt2988 / 2 - 152, this.anInt2989 / 2 - 18, 303, 33);
							local138.setFont(local11);
							local138.setColor(Color.white);
							local138.drawString(local168, (this.anInt2988 - local15.stringWidth(local168)) / 2, this.anInt2989 / 2 + 4);
						}
					} catch (@Pc(215) Exception local215) {
					}
				}
			}
			local69.close();
		} catch (@Pc(221) IOException local221) {
			return null;
		}
		return this.method2136(local4, arg3) ? local4 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;ILjava/lang/String;I)[B")
	private byte[] method2135(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(4) byte[] local4 = this.method2137(arg1);
		if (!this.method2136(local4, arg0)) {
			local4 = this.method2134(false, arg3, arg2, arg0);
			if (local4 == null) {
				local4 = this.method2134(true, arg3, arg2, arg0);
			}
			if (local4 == null) {
				this.method2132("download");
				return null;
			}
			if (!this.method2133(arg1, local4)) {
				return null;
			}
			local4 = this.method2137(arg1);
			if (!this.method2136(local4, arg0)) {
				this.method2132("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt2988 = Integer.parseInt(this.getParameter("width"));
			this.anInt2989 = Integer.parseInt(this.getParameter("height"));
			@Pc(13) int local13 = 32;
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local13 += local18;
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
			} catch (@Pc(46) Exception local46) {
			}
			try {
				this.aClass86_1 = new Class86(true, this, local13, "runescape", 16);
			} catch (@Pc(58) Exception local58) {
				this.method2132("nocache");
				return;
			}
			@Pc(69) ClassLoader_Sub1 local69 = new ClassLoader_Sub1();
			@Pc(86) byte[] local86;
			try {
				Class.forName("java.util.jar.Pack200");
				local86 = this.method2135("runescape_-322904482.pack200", new File(this.aClass86_1.aFile5, "main_file_cache.dat0"), 240753, local28);
				if (local86 == null) {
					return;
				}
				local69.aClass84_1 = new Class84_Sub1(local86);
			} catch (@Pc(98) Throwable local98) {
			}
			@Pc(128) Class local128;
			if (local69.aClass84_1 == null) {
				local86 = this.method2135("unpackclass_-163111980.jar", new File(this.aClass86_1.aFile5, "game_unpacker.dat"), 19185, local26);
				if (local86 == null) {
					return;
				}
				local69.aClass84_1 = new Class84(local86);
				local128 = Class.forName("Class84");
				local69.aHashtable3.put(local128.getName(), local128);
				@Pc(139) Class local139 = local69.loadClass("unpackclass");
				local69 = new ClassLoader_Sub1();
				local86 = this.method2135("runescape_324460577.js5", new File(this.aClass86_1.aFile5, "main_file_cache.dat1"), 256195, local28);
				if (local86 == null) {
					return;
				}
				local69.aClass84_1 = (Class84) local139.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local86, Boolean.TRUE);
			}
			local128 = Class.forName("Class87");
			local69.aHashtable3.put(local128.getName(), local128);
			@Pc(202) Class local202 = Class.forName("Class86");
			local69.aHashtable3.put(local202.getName(), local202);
			local128 = Class.forName("Class85");
			local69.aHashtable3.put(local128.getName(), local128);
			local128 = Class.forName("Interface4");
			local69.aHashtable3.put(local128.getName(), local128);
			local128 = local69.loadClass("client");
			this.anApplet3 = (Applet) local128.getDeclaredConstructor().newInstance();
			local128.getMethod("providesignlink", local202).invoke(null, this.aClass86_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(265) Exception local265) {
			RuntimeException_Sub2.anInt2982 = 324460577;
			if (local265 instanceof InvocationTargetException) {
				@Pc(274) Throwable local274 = ((InvocationTargetException) local265).getTargetException();
				if (local274 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2115(local265.toString(), local274, this);
			} else {
				RuntimeException_Sub2.method2115(null, local265, this);
			}
			this.method2132("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/lang/String;)Z")
	private boolean method2136(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg0);
			@Pc(15) byte[] local15 = local7.digest();
			if (arg1 == "runescape_-322904482.pack200") {
				if (local15[0] != -50 || local15[1] != 87 || local15[2] != -49 || local15[3] != 13 || local15[4] != 126 || local15[5] != 39 || local15[6] != -123 || local15[7] != 81 || local15[8] != -119 || local15[9] != 67 || local15[10] != -71 || local15[11] != -41 || local15[12] != -17 || local15[13] != 16 || local15[14] != -116 || local15[15] != 90 || local15[16] != 74 || local15[17] != -60 || local15[18] != -73 || local15[19] != 15) {
					return false;
				}
			} else if (arg1 == "runescape_324460577.js5") {
				if (local15[0] != 49 || local15[1] != 73 || local15[2] != -123 || local15[3] != -37 || local15[4] != -53 || local15[5] != -51 || local15[6] != 121 || local15[7] != 90 || local15[8] != -53 || local15[9] != 117 || local15[10] != -23 || local15[11] != 78 || local15[12] != 54 || local15[13] != -96 || local15[14] != -66 || local15[15] != 49 || local15[16] != 48 || local15[17] != 5 || local15[18] != 17 || local15[19] != 14) {
					return false;
				}
			} else if (local15[0] != 23 || local15[1] != 83 || local15[2] != 57 || local15[3] != 35 || local15[4] != 83 || local15[5] != -48 || local15[6] != 29 || local15[7] != -121 || local15[8] != 101 || local15[9] != 45 || local15[10] != -13 || local15[11] != -62 || local15[12] != -10 || local15[13] != 46 || local15[14] != -57 || local15[15] != -48 || local15[16] != 115 || local15[17] != 102 || local15[18] != 94 || local15[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(398) Exception local398) {
			this.method2132("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2137(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(16) int local16 = (int) arg0.length();
			@Pc(27) DataInputStream local27 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(30) byte[] local30 = new byte[local16];
			local27.readFully(local30, 0, local16);
			local27.close();
			return local30;
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}
}
