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
	private int anInt3217;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!fe;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt3218;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean158;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;BI)[B")
	private byte[] method2256(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(25) byte[] local25 = new byte[arg3];
		try {
			@Pc(35) InputStream local35;
			if (arg1) {
				@Pc(40) URL local40 = this.getCodeBase();
				@Pc(48) Socket local48 = new Socket(InetAddress.getByName(local40.getHost()), 443);
				local48.setSoTimeout(10000);
				@Pc(54) OutputStream local54 = local48.getOutputStream();
				local54.write(17);
				local54.write(("JAGGRAB " + local40.getFile() + arg2 + "\n\n").getBytes());
				local35 = local48.getInputStream();
			} else {
				local35 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = 0;
			while (local25.length > local80) {
				@Pc(90) int local90 = local25.length - local80;
				if (local90 > 1000) {
					local90 = 1000;
				}
				@Pc(103) int local103 = local35.read(local25, local80, local90);
				if (local103 < 0) {
					throw new EOFException();
				}
				local80 += local103;
				@Pc(121) int local121 = local80 * 100 / local25.length;
				if (local121 != local78) {
					try {
						@Pc(127) Graphics local127 = this.getGraphics();
						if (local127 == null) {
							this.repaint();
						} else {
							local127.setColor(Color.black);
							local78 = local121;
							@Pc(152) String local152 = arg0 + " - " + local121 + "%";
							local127.fillRect(0, 0, this.anInt3218, this.anInt3217);
							local127.setColor(local17);
							local127.drawRect(this.anInt3218 / 2 - 152, this.anInt3217 / 2 + -18, 303, 33);
							local127.setFont(local8);
							local127.setColor(Color.white);
							local127.drawString(local152, (this.anInt3218 - local12.stringWidth(local152)) / 2, this.anInt3217 / 2 + 4);
						}
					} catch (@Pc(204) Exception local204) {
					}
				}
			}
			local35.close();
		} catch (@Pc(210) IOException local210) {
			return null;
		}
		return this.method2258(local25, arg2) ? local25 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;IILjava/lang/String;)[B")
	private byte[] method2257(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(10) byte[] local10 = this.method2260(arg1);
		if (!this.method2258(local10, arg0)) {
			local10 = this.method2256(arg3, false, arg0, arg2);
			if (local10 == null) {
				local10 = this.method2256(arg3, true, arg0, arg2);
			}
			if (local10 == null) {
				this.method2261("download");
				return null;
			}
			if (!this.method2259(arg1, local10)) {
				return null;
			}
			local10 = this.method2260(arg1);
			if (!this.method2258(local10, arg0)) {
				this.method2261("mismatch");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLjava/lang/String;)Z")
	private boolean method2258(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(6) MessageDigest local6 = MessageDigest.getInstance("SHA");
			local6.reset();
			local6.update(arg0);
			@Pc(14) byte[] local14 = local6.digest();
			if (arg1 == "runescape_-111267964.pack200") {
				if (local14[0] != 107 || local14[1] != -56 || local14[2] != -29 || local14[3] != 88 || local14[4] != 84 || local14[5] != -67 || local14[6] != 35 || local14[7] != 125 || local14[8] != 98 || local14[9] != -119 || local14[10] != 14 || local14[11] != -58 || local14[12] != 84 || local14[13] != -118 || local14[14] != -30 || local14[15] != 69 || local14[16] != 40 || local14[17] != 117 || local14[18] != 110 || local14[19] != 16) {
					return false;
				}
			} else if (arg1 == "runescape_427393249.js5") {
				if (local14[0] != 76 || local14[1] != 125 || local14[2] != 45 || local14[3] != -8 || local14[4] != 73 || local14[5] != -78 || local14[6] != 2 || local14[7] != -91 || local14[8] != -125 || local14[9] != -55 || local14[10] != -24 || local14[11] != -96 || local14[12] != 103 || local14[13] != 18 || local14[14] != 109 || local14[15] != 41 || local14[16] != 109 || local14[17] != 92 || local14[18] != 35 || local14[19] != -116) {
					return false;
				}
			} else if (local14[0] != 23 || local14[1] != 83 || local14[2] != 57 || local14[3] != 35 || local14[4] != 83 || local14[5] != -48 || local14[6] != 29 || local14[7] != -121 || local14[8] != 101 || local14[9] != 45 || local14[10] != -13 || local14[11] != -62 || local14[12] != -10 || local14[13] != 46 || local14[14] != -57 || local14[15] != -48 || local14[16] != 115 || local14[17] != 102 || local14[18] != 94 || local14[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(396) Exception local396) {
			this.method2261("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method2259(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg0);
			local10.write(arg1, 0, arg1.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method2261("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method2260(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(26) DataInputStream local26 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(29) byte[] local29 = new byte[local9];
			local26.readFully(local29, 0, local9);
			local26.close();
			return local29;
		} catch (@Pc(39) IOException local39) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2261(@OriginalArg(1) String arg0) {
		if (this.aBoolean158) {
			return;
		}
		this.aBoolean158 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3218 = Integer.parseInt(this.getParameter("width"));
			@Pc(7) int local7 = 32;
			this.anInt3217 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local7 += local18;
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
			} catch (@Pc(46) Exception local46) {
			}
			try {
				this.aClass84_1 = new Class84(true, this, local7, "runescape", 16);
			} catch (@Pc(58) Exception local58) {
				this.method2261("nocache");
				return;
			}
			@Pc(69) ClassLoader_Sub1 local69 = new ClassLoader_Sub1();
			@Pc(86) byte[] local86;
			try {
				Class.forName("java.util.jar.Pack200");
				local86 = this.method2257("runescape_-111267964.pack200", new File(this.aClass84_1.aFile4, "main_file_cache.dat0"), 234533, local26);
				if (local86 == null) {
					return;
				}
				local69.aClass82_1 = new Class82_Sub1(local86);
			} catch (@Pc(99) Throwable local99) {
			}
			@Pc(129) Class local129;
			if (local69.aClass82_1 == null) {
				local86 = this.method2257("unpackclass_-163111980.jar", new File(this.aClass84_1.aFile4, "game_unpacker.dat"), 19185, local28);
				if (local86 == null) {
					return;
				}
				local69.aClass82_1 = new Class82(local86);
				local129 = Class.forName("Class82");
				local69.aHashtable3.put(local129.getName(), local129);
				@Pc(140) Class local140 = local69.loadClass("unpackclass");
				local69 = new ClassLoader_Sub1();
				local86 = this.method2257("runescape_427393249.js5", new File(this.aClass84_1.aFile4, "main_file_cache.dat1"), 249954, local26);
				if (local86 == null) {
					return;
				}
				local69.aClass82_1 = (Class82) local140.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local86, Boolean.TRUE);
			}
			local129 = Class.forName("Class85");
			local69.aHashtable3.put(local129.getName(), local129);
			@Pc(201) Class local201 = Class.forName("Class84");
			local69.aHashtable3.put(local201.getName(), local201);
			local129 = Class.forName("Class83");
			local69.aHashtable3.put(local129.getName(), local129);
			local129 = Class.forName("Interface4");
			local69.aHashtable3.put(local129.getName(), local129);
			local129 = local69.loadClass("client");
			this.anApplet3 = (Applet) local129.getDeclaredConstructor().newInstance();
			local129.getMethod("providesignlink", local201).invoke(null, this.aClass84_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(264) Exception local264) {
			RuntimeException_Sub2.anInt3211 = 427393249;
			if (local264 instanceof InvocationTargetException) {
				@Pc(280) Throwable local280 = ((InvocationTargetException) local264).getTargetException();
				if (local280 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2238(this, local280, local264.toString());
			} else {
				RuntimeException_Sub2.method2238(this, local264, null);
			}
			this.method2261("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}
}
