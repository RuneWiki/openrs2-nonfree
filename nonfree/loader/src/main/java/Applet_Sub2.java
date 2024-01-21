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
	private int anInt3164;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!dc;")
	private Class86 aClass86_1;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt3165;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean288;

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3165 = Integer.parseInt(this.getParameter("width"));
			this.anInt3164 = Integer.parseInt(this.getParameter("height"));
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
					local28 = "Lade Entpacker";
					local26 = "Lade Spiel-Code";
				}
			} catch (@Pc(45) Exception local45) {
			}
			try {
				this.aClass86_1 = new Class86(true, this, local13, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method2076("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method2073(local26, 241273, "runescape_-271197245.pack200", new File(this.aClass86_1.aFile5, "main_file_cache.dat0"));
				if (local85 == null) {
					return;
				}
				local68.aClass84_1 = new Class84_Sub1(local85);
			} catch (@Pc(96) Throwable local96) {
			}
			@Pc(127) Class local127;
			if (local68.aClass84_1 == null) {
				local85 = this.method2073(local28, 19185, "unpackclass_-163111980.jar", new File(this.aClass86_1.aFile5, "game_unpacker.dat"));
				if (local85 == null) {
					return;
				}
				local68.aClass84_1 = new Class84(local85);
				local127 = Class.forName("Class84");
				local68.aHashtable3.put(local127.getName(), local127);
				@Pc(138) Class local138 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method2073(local26, 255732, "runescape_712540463.js5", new File(this.aClass86_1.aFile5, "main_file_cache.dat1"));
				if (local85 == null) {
					return;
				}
				local68.aClass84_1 = (Class84) local138.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local127 = Class.forName("Class87");
			local68.aHashtable3.put(local127.getName(), local127);
			@Pc(200) Class local200 = Class.forName("Class86");
			local68.aHashtable3.put(local200.getName(), local200);
			local127 = Class.forName("Class85");
			local68.aHashtable3.put(local127.getName(), local127);
			local127 = Class.forName("Interface4");
			local68.aHashtable3.put(local127.getName(), local127);
			local127 = local68.loadClass("client");
			this.anApplet3 = (Applet) local127.getDeclaredConstructor().newInstance();
			local127.getMethod("providesignlink", local200).invoke(null, this.aClass86_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(263) Exception local263) {
			RuntimeException_Sub2.anInt3158 = 712540463;
			if (local263 instanceof InvocationTargetException) {
				@Pc(272) Throwable local272 = ((InvocationTargetException) local263).getTargetException();
				if (local272 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2044(local263.toString(), this, local272);
			} else {
				RuntimeException_Sub2.method2044(null, this, local263);
			}
			this.method2076("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method2072(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method2076("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;Ljava/io/File;)[B")
	private byte[] method2073(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) File arg3) {
		@Pc(10) byte[] local10 = this.method2075(arg3);
		if (!this.method2077(local10, arg2)) {
			local10 = this.method2074(arg1, arg0, false, arg2);
			if (local10 == null) {
				local10 = this.method2074(arg1, arg0, true, arg2);
			}
			if (local10 == null) {
				this.method2076("download");
				return null;
			}
			if (!this.method2072(local10, arg3)) {
				return null;
			}
			local10 = this.method2075(arg3);
			if (!this.method2077(local10, arg2)) {
				this.method2076("mismatch");
				return null;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;I)[B")
	private byte[] method2074(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(17) FontMetrics local17 = this.getFontMetrics(local8);
		@Pc(22) Color local22 = new Color(9179409);
		@Pc(25) byte[] local25 = new byte[arg0];
		try {
			@Pc(35) InputStream local35;
			if (arg2) {
				@Pc(40) URL local40 = this.getCodeBase();
				@Pc(48) Socket local48 = new Socket(InetAddress.getByName(local40.getHost()), 443);
				local48.setSoTimeout(10000);
				@Pc(54) OutputStream local54 = local48.getOutputStream();
				local54.write(17);
				local54.write(("JAGGRAB " + local40.getFile() + arg3 + "\n\n").getBytes());
				local35 = local48.getInputStream();
			} else {
				local35 = (new URL(this.getCodeBase(), arg3)).openStream();
			}
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = 0;
			while (local80 < local25.length) {
				@Pc(93) int local93 = local25.length - local80;
				if (local93 > 1000) {
					local93 = 1000;
				}
				@Pc(105) int local105 = local35.read(local25, local80, local93);
				if (local105 < 0) {
					throw new EOFException();
				}
				local80 += local105;
				@Pc(125) int local125 = local80 * 100 / local25.length;
				if (local125 != local78) {
					try {
						@Pc(135) Graphics local135 = this.getGraphics();
						if (local135 == null) {
							this.repaint();
						} else {
							local78 = local125;
							local135.setColor(Color.black);
							local135.fillRect(0, 0, this.anInt3165, this.anInt3164);
							@Pc(168) String local168 = arg1 + " - " + local125 + "%";
							local135.setColor(local22);
							local135.drawRect(this.anInt3165 / 2 - 152, this.anInt3164 / 2 - 18, 303, 33);
							local135.setFont(local8);
							local135.setColor(Color.white);
							local135.drawString(local168, (this.anInt3165 - local17.stringWidth(local168)) / 2, this.anInt3164 / 2 + 4);
						}
					} catch (@Pc(213) Exception local213) {
					}
				}
			}
			local35.close();
		} catch (@Pc(219) IOException local219) {
			return null;
		}
		return this.method2077(local25, arg3) ? local25 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method2075(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2076(@OriginalArg(1) String arg0) {
		if (this.aBoolean288) {
			return;
		}
		this.aBoolean288 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(35) Exception local35) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/lang/String;)Z")
	private boolean method2077(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(13) MessageDigest local13 = MessageDigest.getInstance("SHA");
			local13.reset();
			local13.update(arg0);
			@Pc(21) byte[] local21 = local13.digest();
			if (arg1 == "runescape_-271197245.pack200") {
				if (local21[0] != 72 || local21[1] != 125 || local21[2] != 113 || local21[3] != -7 || local21[4] != -117 || local21[5] != -13 || local21[6] != 112 || local21[7] != 63 || local21[8] != 74 || local21[9] != -42 || local21[10] != -118 || local21[11] != -80 || local21[12] != 125 || local21[13] != 105 || local21[14] != 126 || local21[15] != 25 || local21[16] != -85 || local21[17] != -128 || local21[18] != 103 || local21[19] != 20) {
					return false;
				}
			} else if (arg1 == "runescape_712540463.js5") {
				if (local21[0] != 40 || local21[1] != -125 || local21[2] != -115 || local21[3] != 57 || local21[4] != -27 || local21[5] != 13 || local21[6] != 83 || local21[7] != -3 || local21[8] != -115 || local21[9] != 17 || local21[10] != 65 || local21[11] != 34 || local21[12] != -28 || local21[13] != -78 || local21[14] != -47 || local21[15] != 106 || local21[16] != 17 || local21[17] != 71 || local21[18] != 110 || local21[19] != -32) {
					return false;
				}
			} else if (local21[0] != 23 || local21[1] != 83 || local21[2] != 57 || local21[3] != 35 || local21[4] != 83 || local21[5] != -48 || local21[6] != 29 || local21[7] != -121 || local21[8] != 101 || local21[9] != 45 || local21[10] != -13 || local21[11] != -62 || local21[12] != -10 || local21[13] != 46 || local21[14] != -57 || local21[15] != -48 || local21[16] != 115 || local21[17] != 102 || local21[18] != 94 || local21[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(383) Exception local383) {
			this.method2076("sha");
			return false;
		}
	}
}
