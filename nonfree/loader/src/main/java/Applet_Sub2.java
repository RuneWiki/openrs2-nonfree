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
	private int anInt3174;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt3175;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!w;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean255;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/lang/String;)Z")
	private boolean method2226(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(15) MessageDigest local15 = MessageDigest.getInstance("SHA");
			local15.reset();
			local15.update(arg0);
			@Pc(23) byte[] local23 = local15.digest();
			if (arg1 == "runescape_372469025.pack200") {
				if (local23[0] != 54 || local23[1] != -89 || local23[2] != -33 || local23[3] != 3 || local23[4] != -124 || local23[5] != -87 || local23[6] != 70 || local23[7] != -109 || local23[8] != -105 || local23[9] != 77 || local23[10] != -25 || local23[11] != -110 || local23[12] != -24 || local23[13] != 59 || local23[14] != -29 || local23[15] != -67 || local23[16] != 80 || local23[17] != -87 || local23[18] != -24 || local23[19] != -79) {
					return false;
				}
			} else if (arg1 == "runescape_-370611941.js5") {
				if (local23[0] != -67 || local23[1] != -62 || local23[2] != -117 || local23[3] != -16 || local23[4] != -67 || local23[5] != 44 || local23[6] != -7 || local23[7] != -60 || local23[8] != -30 || local23[9] != -29 || local23[10] != -64 || local23[11] != -106 || local23[12] != 54 || local23[13] != -93 || local23[14] != 112 || local23[15] != 87 || local23[16] != -119 || local23[17] != 17 || local23[18] != -35 || local23[19] != 13) {
					return false;
				}
			} else if (local23[0] != 3 || local23[1] != -21 || local23[2] != 65 || local23[3] != -60 || local23[4] != -33 || local23[5] != -24 || local23[6] != 92 || local23[7] != 4 || local23[8] != -2 || local23[9] != 48 || local23[10] != 106 || local23[11] != 50 || local23[12] != -46 || local23[13] != -31 || local23[14] != -44 || local23[15] != 120 || local23[16] != -104 || local23[17] != 72 || local23[18] != 50 || local23[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(394) Exception local394) {
			this.method2227("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2227(@OriginalArg(1) String arg0) {
		if (this.aBoolean255) {
			return;
		}
		this.aBoolean255 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method2228(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method2227("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt3175 = Integer.parseInt(this.getParameter("width"));
			this.anInt3174 = Integer.parseInt(this.getParameter("height"));
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
				this.aClass85_1 = new Class85(true, this, local1, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method2227("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method2231(new File(this.aClass85_1.aFile6, "main_file_cache.dat0"), "runescape_372469025.pack200", 241352, local26);
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = new Class82_Sub1(local85);
			} catch (@Pc(96) Throwable local96) {
			}
			@Pc(126) Class local126;
			if (local68.aClass82_1 == null) {
				local85 = this.method2231(new File(this.aClass85_1.aFile6, "game_unpacker.dat"), "unpackclass_-549807395.jar", 17836, local28);
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = new Class82(local85);
				local126 = Class.forName("Class82");
				local68.aHashtable3.put(local126.getName(), local126);
				@Pc(137) Class local137 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method2231(new File(this.aClass85_1.aFile6, "main_file_cache.dat1"), "runescape_-370611941.js5", 258201, local26);
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = (Class82) local137.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local126 = Class.forName("Class83");
			local68.aHashtable3.put(local126.getName(), local126);
			@Pc(199) Class local199 = Class.forName("Class85");
			local68.aHashtable3.put(local199.getName(), local199);
			local126 = Class.forName("Class84");
			local68.aHashtable3.put(local126.getName(), local126);
			local126 = Class.forName("Interface4");
			local68.aHashtable3.put(local126.getName(), local126);
			local126 = local68.loadClass("client");
			this.anApplet2 = (Applet) local126.getDeclaredConstructor().newInstance();
			local126.getMethod("providesignlink", local199).invoke(null, this.aClass85_1);
			this.anApplet2.init();
			this.anApplet2.start();
		} catch (@Pc(262) Exception local262) {
			RuntimeException_Sub2.anInt3169 = -370611941;
			if (local262 instanceof InvocationTargetException) {
				@Pc(271) Throwable local271 = ((InvocationTargetException) local262).getTargetException();
				if (local271 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2215(this, local271, local262.toString());
			} else {
				RuntimeException_Sub2.method2215(this, local262, null);
			}
			this.method2227("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2229(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;BZLjava/lang/String;)[B")
	private byte[] method2230(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(11) byte[] local11 = new byte[arg0];
		@Pc(15) FontMetrics local15 = this.getFontMetrics(local8);
		@Pc(20) Color local20 = new Color(9179409);
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
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = 0;
			while (local11.length > local81) {
				@Pc(91) int local91 = local11.length - local81;
				if (local91 > 1000) {
					local91 = 1000;
				}
				@Pc(105) int local105 = local61.read(local11, local81, local91);
				if (local105 < 0) {
					throw new EOFException();
				}
				local81 += local105;
				@Pc(125) int local125 = local81 * 100 / local11.length;
				if (local125 != local79) {
					try {
						@Pc(135) Graphics local135 = this.getGraphics();
						if (local135 == null) {
							this.repaint();
						} else {
							local79 = local125;
							local135.setColor(Color.black);
							local135.fillRect(0, 0, this.anInt3175, this.anInt3174);
							local135.setColor(local20);
							@Pc(171) String local171 = arg3 + " - " + local125 + "%";
							local135.drawRect(this.anInt3175 / 2 - 152, this.anInt3174 / 2 + -18, 303, 33);
							local135.setFont(local8);
							local135.setColor(Color.white);
							local135.drawString(local171, (this.anInt3175 - local15.stringWidth(local171)) / 2, this.anInt3174 / 2 + 4);
						}
					} catch (@Pc(212) Exception local212) {
					}
				}
			}
			local61.close();
		} catch (@Pc(218) IOException local218) {
			return null;
		}
		return this.method2226(local11, arg1) ? local11 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;ILjava/lang/String;)[B")
	private byte[] method2231(@OriginalArg(0) File arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(10) byte[] local10 = this.method2229(arg0);
		if (!this.method2226(local10, arg1)) {
			local10 = this.method2230(arg2, arg1, false, arg3);
			if (local10 == null) {
				local10 = this.method2230(arg2, arg1, true, arg3);
			}
			if (local10 == null) {
				this.method2227("download");
				return null;
			}
			if (!this.method2228(arg0, local10)) {
				return null;
			}
			local10 = this.method2229(arg0);
			if (!this.method2226(local10, arg1)) {
				this.method2227("mismatch");
				return null;
			}
		}
		return local10;
	}
}
