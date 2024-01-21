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
	private int anInt2851;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt2852;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Lloader!cf;")
	private Class86 aClass86_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean162;

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt2851 = Integer.parseInt(this.getParameter("width"));
			this.anInt2852 = Integer.parseInt(this.getParameter("height"));
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
					local26 = "Lade Entpacker";
					local28 = "Lade Spiel-Code";
				}
			} catch (@Pc(44) Exception local44) {
			}
			try {
				this.aClass86_1 = new Class86(true, this, local13, "runescape", 16);
			} catch (@Pc(56) Exception local56) {
				this.method2056("nocache");
				return;
			}
			@Pc(67) ClassLoader_Sub1 local67 = new ClassLoader_Sub1();
			@Pc(84) byte[] local84;
			try {
				Class.forName("java.util.jar.Pack200");
				local84 = this.method2052(241150, local28, "runescape_-76518335.pack200", new File(this.aClass86_1.aFile6, "main_file_cache.dat0"));
				if (local84 == null) {
					return;
				}
				local67.aClass84_1 = new Class84_Sub1(local84);
			} catch (@Pc(96) Throwable local96) {
			}
			@Pc(127) Class local127;
			if (local67.aClass84_1 == null) {
				local84 = this.method2052(19185, local26, "unpackclass_-163111980.jar", new File(this.aClass86_1.aFile6, "game_unpacker.dat"));
				if (local84 == null) {
					return;
				}
				local67.aClass84_1 = new Class84(local84);
				local127 = Class.forName("Class84");
				local67.aHashtable1.put(local127.getName(), local127);
				@Pc(138) Class local138 = local67.loadClass("unpackclass");
				local67 = new ClassLoader_Sub1();
				local84 = this.method2052(256901, local28, "runescape_1191411937.js5", new File(this.aClass86_1.aFile6, "main_file_cache.dat1"));
				if (local84 == null) {
					return;
				}
				local67.aClass84_1 = (Class84) local138.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local84, Boolean.TRUE);
			}
			local127 = Class.forName("Class85");
			local67.aHashtable1.put(local127.getName(), local127);
			@Pc(200) Class local200 = Class.forName("Class86");
			local67.aHashtable1.put(local200.getName(), local200);
			local127 = Class.forName("Class87");
			local67.aHashtable1.put(local127.getName(), local127);
			local127 = Class.forName("Interface4");
			local67.aHashtable1.put(local127.getName(), local127);
			local127 = local67.loadClass("client");
			this.anApplet3 = (Applet) local127.getDeclaredConstructor().newInstance();
			local127.getMethod("providesignlink", local200).invoke(null, this.aClass86_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(263) Exception local263) {
			RuntimeException_Sub2.anInt2845 = 1191411937;
			if (local263 instanceof InvocationTargetException) {
				@Pc(279) Throwable local279 = ((InvocationTargetException) local263).getTargetException();
				if (local279 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2024(local263.toString(), this, local279);
			} else {
				RuntimeException_Sub2.method2024(null, this, local263);
			}
			this.method2056("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/io/File;)[B")
	private byte[] method2052(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) File arg3) {
		@Pc(4) byte[] local4 = this.method2055(arg3);
		if (!this.method2057(arg2, local4)) {
			local4 = this.method2054(false, arg2, arg0, arg1);
			if (local4 == null) {
				local4 = this.method2054(true, arg2, arg0, arg1);
			}
			if (local4 == null) {
				this.method2056("download");
				return null;
			}
			if (!this.method2053(arg3, local4)) {
				return null;
			}
			local4 = this.method2055(arg3);
			if (!this.method2057(arg2, local4)) {
				this.method2056("mismatch");
				return null;
			}
		}
		return local4;
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
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Z[B)Z")
	private boolean method2053(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method2056("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILjava/lang/String;ILjava/lang/String;)[B")
	private byte[] method2054(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg2];
		try {
			@Pc(30) InputStream local30;
			if (arg0) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg1 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(73) int local73 = -1;
			@Pc(75) int local75 = 0;
			while (local75 < local20.length) {
				@Pc(84) int local84 = local20.length - local75;
				if (local84 > 1000) {
					local84 = 1000;
				}
				@Pc(98) int local98 = local30.read(local20, local75, local84);
				if (local98 < 0) {
					throw new EOFException();
				}
				local75 += local98;
				@Pc(115) int local115 = local75 * 100 / local20.length;
				if (local73 != local115) {
					try {
						@Pc(125) Graphics local125 = this.getGraphics();
						if (local125 == null) {
							this.repaint();
						} else {
							local125.setColor(Color.black);
							local125.fillRect(0, 0, this.anInt2851, this.anInt2852);
							@Pc(152) String local152 = arg3 + " - " + local115 + "%";
							local125.setColor(local17);
							local125.drawRect(this.anInt2851 / 2 - 152, this.anInt2852 / 2 - 18, 303, 33);
							local125.setFont(local8);
							local73 = local115;
							local125.setColor(Color.white);
							local125.drawString(local152, (this.anInt2851 - local12.stringWidth(local152)) / 2, this.anInt2852 / 2 + 4);
						}
					} catch (@Pc(203) Exception local203) {
					}
				}
			}
			local30.close();
		} catch (@Pc(209) IOException local209) {
			return null;
		}
		return this.method2057(arg1, local20) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2055(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(12) byte[] local12 = new byte[local9];
			@Pc(23) DataInputStream local23 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local23.readFully(local12, 0, local9);
			local23.close();
			return local12;
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2056(@OriginalArg(1) String arg0) {
		if (this.aBoolean162) {
			return;
		}
		this.aBoolean162 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(33) Exception local33) {
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
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I[B)Z")
	private boolean method2057(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(6) MessageDigest local6 = MessageDigest.getInstance("SHA");
			local6.reset();
			local6.update(arg1);
			@Pc(19) byte[] local19 = local6.digest();
			if (arg0 == "runescape_-76518335.pack200") {
				if (local19[0] != -41 || local19[1] != -76 || local19[2] != -37 || local19[3] != 22 || local19[4] != 29 || local19[5] != -18 || local19[6] != 110 || local19[7] != -67 || local19[8] != -79 || local19[9] != 13 || local19[10] != 5 || local19[11] != -20 || local19[12] != 112 || local19[13] != -48 || local19[14] != -25 || local19[15] != 64 || local19[16] != 28 || local19[17] != -25 || local19[18] != -109 || local19[19] != -61) {
					return false;
				}
			} else if (arg0 == "runescape_1191411937.js5") {
				if (local19[0] != -111 || local19[1] != 90 || local19[2] != -31 || local19[3] != -117 || local19[4] != 98 || local19[5] != 59 || local19[6] != 11 || local19[7] != -102 || local19[8] != 18 || local19[9] != 9 || local19[10] != -33 || local19[11] != 13 || local19[12] != 100 || local19[13] != -44 || local19[14] != 100 || local19[15] != -24 || local19[16] != 124 || local19[17] != 105 || local19[18] != 32 || local19[19] != -100) {
					return false;
				}
			} else if (local19[0] != 23 || local19[1] != 83 || local19[2] != 57 || local19[3] != 35 || local19[4] != 83 || local19[5] != -48 || local19[6] != 29 || local19[7] != -121 || local19[8] != 101 || local19[9] != 45 || local19[10] != -13 || local19[11] != -62 || local19[12] != -10 || local19[13] != 46 || local19[14] != -57 || local19[15] != -48 || local19[16] != 115 || local19[17] != 102 || local19[18] != 94 || local19[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(388) Exception local388) {
			this.method2056("sha");
			return false;
		}
	}
}
