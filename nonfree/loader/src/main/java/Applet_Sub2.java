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
	private int anInt3178;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!dd;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt3179;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean189;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method2132(@OriginalArg(0) String arg0) {
		if (this.aBoolean189) {
			return;
		}
		this.aBoolean189 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(30) Exception local30) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ILjava/io/File;Ljava/lang/String;B)[B")
	private byte[] method2133(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) File arg2, @OriginalArg(3) String arg3) {
		@Pc(12) byte[] local12 = this.method2135(arg2);
		if (!this.method2136(arg0, local12)) {
			local12 = this.method2134(arg1, arg0, arg3, false);
			if (local12 == null) {
				local12 = this.method2134(arg1, arg0, arg3, true);
			}
			if (local12 == null) {
				this.method2132("download");
				return null;
			}
			if (!this.method2137(local12, arg2)) {
				return null;
			}
			local12 = this.method2135(arg2);
			if (!this.method2136(arg0, local12)) {
				this.method2132("mismatch");
				return null;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt3179 = Integer.parseInt(this.getParameter("width"));
			this.anInt3178 = Integer.parseInt(this.getParameter("height"));
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
					local28 = "Lade Entpacker";
					local26 = "Lade Spiel-Code";
				}
			} catch (@Pc(46) Exception local46) {
			}
			try {
				this.aClass85_1 = new Class85(true, this, local1, "runescape", 16);
			} catch (@Pc(58) Exception local58) {
				this.method2132("nocache");
				return;
			}
			@Pc(69) ClassLoader_Sub1 local69 = new ClassLoader_Sub1();
			@Pc(86) byte[] local86;
			try {
				Class.forName("java.util.jar.Pack200");
				local86 = this.method2133("runescape_1096406120.pack200", 236432, new File(this.aClass85_1.aFile5, "main_file_cache.dat0"), local26);
				if (local86 == null) {
					return;
				}
				local69.aClass84_1 = new Class84_Sub1(local86);
			} catch (@Pc(98) Throwable local98) {
			}
			@Pc(129) Class local129;
			if (local69.aClass84_1 == null) {
				local86 = this.method2133("unpackclass_-163111980.jar", 19185, new File(this.aClass85_1.aFile5, "game_unpacker.dat"), local28);
				if (local86 == null) {
					return;
				}
				local69.aClass84_1 = new Class84(local86);
				local129 = Class.forName("Class84");
				local69.aHashtable1.put(local129.getName(), local129);
				@Pc(140) Class local140 = local69.loadClass("unpackclass");
				local69 = new ClassLoader_Sub1();
				local86 = this.method2133("runescape_-61374615.js5", 251738, new File(this.aClass85_1.aFile5, "main_file_cache.dat1"), local26);
				if (local86 == null) {
					return;
				}
				local69.aClass84_1 = (Class84) local140.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local86, Boolean.TRUE);
			}
			local129 = Class.forName("Class83");
			local69.aHashtable1.put(local129.getName(), local129);
			@Pc(201) Class local201 = Class.forName("Class85");
			local69.aHashtable1.put(local201.getName(), local201);
			local129 = Class.forName("Class86");
			local69.aHashtable1.put(local129.getName(), local129);
			local129 = Class.forName("Interface4");
			local69.aHashtable1.put(local129.getName(), local129);
			local129 = local69.loadClass("client");
			this.anApplet3 = (Applet) local129.getDeclaredConstructor().newInstance();
			local129.getMethod("providesignlink", local201).invoke(null, this.aClass85_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(264) Exception local264) {
			RuntimeException_Sub2.anInt3175 = -61374615;
			if (local264 instanceof InvocationTargetException) {
				@Pc(280) Throwable local280 = ((InvocationTargetException) local264).getTargetException();
				if (local280 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2117(local280, local264.toString(), this);
			} else {
				RuntimeException_Sub2.method2117(local264, null, this);
			}
			this.method2132("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;BZ)[B")
	private byte[] method2134(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) boolean arg3) {
		@Pc(14) Font local14 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local14);
		@Pc(23) Color local23 = new Color(9179409);
		@Pc(26) byte[] local26 = new byte[arg0];
		try {
			@Pc(36) InputStream local36;
			if (arg3) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg1 + "\n\n").getBytes());
				local36 = local49.getInputStream();
			} else {
				local36 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = 0;
			while (local81 < local26.length) {
				@Pc(91) int local91 = local26.length - local81;
				if (local91 > 1000) {
					local91 = 1000;
				}
				@Pc(104) int local104 = local36.read(local26, local81, local91);
				if (local104 < 0) {
					throw new EOFException();
				}
				local81 += local104;
				@Pc(125) int local125 = local81 * 100 / local26.length;
				if (local79 != local125) {
					try {
						@Pc(132) Graphics local132 = this.getGraphics();
						if (local132 == null) {
							this.repaint();
						} else {
							local132.setColor(Color.black);
							@Pc(154) String local154 = arg2 + " - " + local125 + "%";
							local132.fillRect(0, 0, this.anInt3179, this.anInt3178);
							local132.setColor(local23);
							local132.drawRect(this.anInt3179 / 2 - 152, this.anInt3178 / 2 + -18, 303, 33);
							local79 = local125;
							local132.setFont(local14);
							local132.setColor(Color.white);
							local132.drawString(local154, (this.anInt3179 - local18.stringWidth(local154)) / 2, this.anInt3178 / 2 + 4);
						}
					} catch (@Pc(208) Exception local208) {
					}
				}
			}
			local36.close();
		} catch (@Pc(214) IOException local214) {
			return null;
		}
		return this.method2136(arg1, local26) ? local26 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method2135(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(15) int local15 = (int) arg0.length();
			@Pc(18) byte[] local18 = new byte[local15];
			@Pc(29) DataInputStream local29 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local29.readFully(local18, 0, local15);
			local29.close();
			return local18;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;[BB)Z")
	private boolean method2136(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg1);
			@Pc(21) byte[] local21 = local8.digest();
			if (arg0 == "runescape_1096406120.pack200") {
				if (local21[0] != -120 || local21[1] != -41 || local21[2] != -49 || local21[3] != -6 || local21[4] != -102 || local21[5] != -70 || local21[6] != -59 || local21[7] != 109 || local21[8] != -92 || local21[9] != 15 || local21[10] != 36 || local21[11] != -23 || local21[12] != -98 || local21[13] != -72 || local21[14] != -22 || local21[15] != -62 || local21[16] != 94 || local21[17] != 6 || local21[18] != 105 || local21[19] != -117) {
					return false;
				}
			} else if (arg0 == "runescape_-61374615.js5") {
				if (local21[0] != -89 || local21[1] != -61 || local21[2] != -91 || local21[3] != -47 || local21[4] != -27 || local21[5] != 16 || local21[6] != 5 || local21[7] != 99 || local21[8] != -116 || local21[9] != -115 || local21[10] != 24 || local21[11] != 112 || local21[12] != 99 || local21[13] != 108 || local21[14] != -10 || local21[15] != -68 || local21[16] != 95 || local21[17] != -58 || local21[18] != 14 || local21[19] != 114) {
					return false;
				}
			} else if (local21[0] != 23 || local21[1] != 83 || local21[2] != 57 || local21[3] != 35 || local21[4] != 83 || local21[5] != -48 || local21[6] != 29 || local21[7] != -121 || local21[8] != 101 || local21[9] != 45 || local21[10] != -13 || local21[11] != -62 || local21[12] != -10 || local21[13] != 46 || local21[14] != -57 || local21[15] != -48 || local21[16] != 115 || local21[17] != 102 || local21[18] != 94 || local21[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(406) Exception local406) {
			this.method2132("sha");
			return false;
		}
	}

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

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method2137(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
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
}
