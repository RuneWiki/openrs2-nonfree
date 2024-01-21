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
	private int anInt3087;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Lloader!q;")
	private Class86 aClass86_1;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt3088;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean253;

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method2242(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method2244("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;)[B")
	private byte[] method2243(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(29) byte[] local29 = new byte[local9];
			local20.readFully(local29, 0, local9);
			local20.close();
			return local29;
		} catch (@Pc(39) IOException local39) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2244(@OriginalArg(1) String arg0) {
		if (this.aBoolean253) {
			return;
		}
		this.aBoolean253 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZII)[B")
	private byte[] method2245(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg3];
		try {
			@Pc(61) InputStream local61;
			if (arg2) {
				@Pc(25) URL local25 = this.getCodeBase();
				@Pc(33) Socket local33 = new Socket(InetAddress.getByName(local25.getHost()), 443);
				local33.setSoTimeout(10000);
				@Pc(39) OutputStream local39 = local33.getOutputStream();
				local39.write(17);
				local39.write(("JAGGRAB " + local25.getFile() + arg1 + "\n\n").getBytes());
				local61 = local33.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(73) int local73 = -1;
			@Pc(75) int local75 = 0;
			while (local75 < local20.length) {
				@Pc(91) int local91 = local20.length - local75;
				if (local91 > 1000) {
					local91 = 1000;
				}
				@Pc(102) int local102 = local61.read(local20, local75, local91);
				if (local102 < 0) {
					throw new EOFException();
				}
				local75 += local102;
				@Pc(119) int local119 = local75 * 100 / local20.length;
				if (local119 != local73) {
					try {
						@Pc(126) Graphics local126 = this.getGraphics();
						if (local126 == null) {
							this.repaint();
						} else {
							local126.setColor(Color.black);
							@Pc(144) String local144 = arg0 + " - " + local119 + "%";
							local126.fillRect(0, 0, this.anInt3087, this.anInt3088);
							local126.setColor(local17);
							local73 = local119;
							local126.drawRect(this.anInt3087 / 2 - 152, this.anInt3088 / 2 + -18, 303, 33);
							local126.setFont(local8);
							local126.setColor(Color.white);
							local126.drawString(local144, (this.anInt3087 - local12.stringWidth(local144)) / 2, this.anInt3088 / 2 + 4);
						}
					} catch (@Pc(203) Exception local203) {
					}
				}
			}
			local61.close();
		} catch (@Pc(209) IOException local209) {
			return null;
		}
		return this.method2247(local20, arg1) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3087 = Integer.parseInt(this.getParameter("width"));
			this.anInt3088 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(44) Exception local44) {
			}
			try {
				this.aClass86_1 = new Class86(true, this, local13, "runescape", 16);
			} catch (@Pc(56) Exception local56) {
				this.method2244("nocache");
				return;
			}
			@Pc(67) ClassLoader_Sub1 local67 = new ClassLoader_Sub1();
			@Pc(84) byte[] local84;
			try {
				Class.forName("java.util.jar.Pack200");
				local84 = this.method2246(242948, "runescape_-1374834541.pack200", new File(this.aClass86_1.aFile4, "main_file_cache.dat0"), local26);
				if (local84 == null) {
					return;
				}
				local67.aClass84_1 = new Class84_Sub1(local84);
			} catch (@Pc(97) Throwable local97) {
			}
			@Pc(127) Class local127;
			if (local67.aClass84_1 == null) {
				local84 = this.method2246(19185, "unpackclass_-163111980.jar", new File(this.aClass86_1.aFile4, "game_unpacker.dat"), local28);
				if (local84 == null) {
					return;
				}
				local67.aClass84_1 = new Class84(local84);
				local127 = Class.forName("Class84");
				local67.aHashtable1.put(local127.getName(), local127);
				@Pc(138) Class local138 = local67.loadClass("unpackclass");
				local67 = new ClassLoader_Sub1();
				local84 = this.method2246(257323, "runescape_34831957.js5", new File(this.aClass86_1.aFile4, "main_file_cache.dat1"), local26);
				if (local84 == null) {
					return;
				}
				local67.aClass84_1 = (Class84) local138.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local84, Boolean.TRUE);
			}
			local127 = Class.forName("Class87");
			local67.aHashtable1.put(local127.getName(), local127);
			@Pc(200) Class local200 = Class.forName("Class86");
			local67.aHashtable1.put(local200.getName(), local200);
			local127 = Class.forName("Class85");
			local67.aHashtable1.put(local127.getName(), local127);
			local127 = Class.forName("Interface4");
			local67.aHashtable1.put(local127.getName(), local127);
			local127 = local67.loadClass("client");
			this.anApplet2 = (Applet) local127.getDeclaredConstructor().newInstance();
			local127.getMethod("providesignlink", local200).invoke(null, this.aClass86_1);
			this.anApplet2.init();
			this.anApplet2.start();
		} catch (@Pc(263) Exception local263) {
			RuntimeException_Sub2.anInt3083 = 34831957;
			if (local263 instanceof InvocationTargetException) {
				@Pc(279) Throwable local279 = ((InvocationTargetException) local263).getTargetException();
				if (local279 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2232(local263.toString(), local279, this);
			} else {
				RuntimeException_Sub2.method2232(null, local263, this);
			}
			this.method2244("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IBLjava/lang/String;Ljava/io/File;Ljava/lang/String;)[B")
	private byte[] method2246(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) File arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = this.method2243(arg2);
		if (!this.method2247(local4, arg1)) {
			local4 = this.method2245(arg3, arg1, false, arg0);
			if (local4 == null) {
				local4 = this.method2245(arg3, arg1, true, arg0);
			}
			if (local4 == null) {
				this.method2244("download");
				return null;
			}
			if (!this.method2242(local4, arg2)) {
				return null;
			}
			local4 = this.method2243(arg2);
			if (!this.method2247(local4, arg1)) {
				this.method2244("mismatch");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;B)Z")
	private boolean method2247(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg0);
			@Pc(20) byte[] local20 = local7.digest();
			if (arg1 == "runescape_-1374834541.pack200") {
				if (local20[0] != 53 || local20[1] != -85 || local20[2] != -37 || local20[3] != 29 || local20[4] != -84 || local20[5] != 78 || local20[6] != -91 || local20[7] != -27 || local20[8] != -71 || local20[9] != 27 || local20[10] != 76 || local20[11] != -69 || local20[12] != 102 || local20[13] != 78 || local20[14] != -7 || local20[15] != -46 || local20[16] != -79 || local20[17] != -27 || local20[18] != -67 || local20[19] != 126) {
					return false;
				}
			} else if (arg1 == "runescape_34831957.js5") {
				if (local20[0] != 79 || local20[1] != -79 || local20[2] != 26 || local20[3] != -123 || local20[4] != 17 || local20[5] != -16 || local20[6] != 85 || local20[7] != 18 || local20[8] != 79 || local20[9] != -125 || local20[10] != 67 || local20[11] != 117 || local20[12] != 20 || local20[13] != -77 || local20[14] != -79 || local20[15] != -21 || local20[16] != -28 || local20[17] != -120 || local20[18] != 23 || local20[19] != 3) {
					return false;
				}
			} else if (local20[0] != 23 || local20[1] != 83 || local20[2] != 57 || local20[3] != 35 || local20[4] != 83 || local20[5] != -48 || local20[6] != 29 || local20[7] != -121 || local20[8] != 101 || local20[9] != 45 || local20[10] != -13 || local20[11] != -62 || local20[12] != -10 || local20[13] != 46 || local20[14] != -57 || local20[15] != -48 || local20[16] != 115 || local20[17] != 102 || local20[18] != 94 || local20[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(395) Exception local395) {
			this.method2244("sha");
			return false;
		}
	}
}
