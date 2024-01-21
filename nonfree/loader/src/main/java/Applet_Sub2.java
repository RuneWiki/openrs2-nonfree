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
	private int anInt2702;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt2703;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Lloader!s;")
	private Class68 aClass68_1;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;ZI)[B")
	private byte[] method1684(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(11) byte[] local11 = new byte[arg3];
		@Pc(15) FontMetrics local15 = this.getFontMetrics(local8);
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(30) InputStream local30;
			if (arg2) {
				@Pc(41) Socket local41 = new Socket(InetAddress.getByName(this.getCodeBase().getHost()), 443);
				local41.setSoTimeout(10000);
				@Pc(47) OutputStream local47 = local41.getOutputStream();
				local47.write(17);
				local47.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
				local30 = local41.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg0)).openStream();
			}
			@Pc(68) int local68 = 0;
			@Pc(70) int local70 = -1;
			while (local68 < local11.length) {
				@Pc(84) int local84 = local11.length - local68;
				if (local84 > 1000) {
					local84 = 1000;
				}
				@Pc(99) int local99 = local30.read(local11, local68, local84);
				if (local99 < 0) {
					throw new EOFException();
				}
				local68 += local99;
				@Pc(118) int local118 = local68 * 100 / local11.length;
				if (local70 != local118) {
					try {
						@Pc(126) Graphics local126 = this.getGraphics();
						if (local126 == null) {
							this.repaint();
						} else {
							local126.setColor(Color.black);
							local70 = local118;
							local126.fillRect(0, 0, this.anInt2703, this.anInt2702);
							local126.setColor(local20);
							local126.drawRect(this.anInt2703 / 2 - 152, this.anInt2702 / 2 + -18, 303, 33);
							local126.setFont(local8);
							@Pc(179) String local179 = "Loading " + arg1 + " - " + local118 + "%";
							local126.setColor(Color.white);
							local126.drawString(local179, (this.anInt2703 - local15.stringWidth(local179)) / 2, this.anInt2702 / 2 + 4);
						}
					} catch (@Pc(205) Exception local205) {
					}
				}
			}
			local30.close();
		} catch (@Pc(218) IOException local218) {
			return null;
		}
		return this.method1686(arg0, local11) ? local11 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/lang/String;)Z")
	private boolean method1685(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(14) FileOutputStream local14 = new FileOutputStream(arg1);
			local14.write(arg0, 0, arg0.length);
			local14.close();
			return true;
		} catch (@Pc(25) IOException local25) {
			this.method1687("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;[BI)Z")
	private boolean method1686(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(11) MessageDigest local11 = MessageDigest.getInstance("SHA");
			local11.reset();
			local11.update(arg1);
			@Pc(19) byte[] local19 = local11.digest();
			if (arg0 == "runescape.pack200?crc=1355614100") {
				if (local19[0] != -90 || local19[1] != 101 || local19[2] != -23 || local19[3] != -18 || local19[4] != -1 || local19[5] != -123 || local19[6] != -106 || local19[7] != 45 || local19[8] != 18 || local19[9] != 65 || local19[10] != -19 || local19[11] != 45 || local19[12] != -18 || local19[13] != -27 || local19[14] != 52 || local19[15] != -115 || local19[16] != -51 || local19[17] != -112 || local19[18] != -68 || local19[19] != -128) {
					return false;
				}
			} else if (arg0 == "runescape.js5?crc=1398872230") {
				if (local19[0] != -77 || local19[1] != -35 || local19[2] != 9 || local19[3] != -3 || local19[4] != -128 || local19[5] != -124 || local19[6] != -54 || local19[7] != 122 || local19[8] != 87 || local19[9] != -124 || local19[10] != -13 || local19[11] != 118 || local19[12] != 64 || local19[13] != 92 || local19[14] != 98 || local19[15] != 51 || local19[16] != -6 || local19[17] != -84 || local19[18] != -117 || local19[19] != 35) {
					return false;
				}
			} else if (local19[0] != 31 || local19[1] != 17 || local19[2] != -1 || local19[3] != -10 || local19[4] != -32 || local19[5] != -13 || local19[6] != -50 || local19[7] != 82 || local19[8] != 69 || local19[9] != -65 || local19[10] != 18 || local19[11] != -120 || local19[12] != -27 || local19[13] != -13 || local19[14] != -56 || local19[15] != -126 || local19[16] != -39 || local19[17] != 24 || local19[18] != 25 || local19[19] != -119) {
				return false;
			}
			return true;
		} catch (@Pc(398) Exception local398) {
			this.method1687("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
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
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method1687(@OriginalArg(1) String arg0) {
		if (this.aBoolean124) {
			return;
		}
		this.aBoolean124 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(30) Exception local30) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)[B")
	private byte[] method1688(@OriginalArg(1) String arg0) {
		try {
			@Pc(4) File local4 = new File(arg0);
			if (!local4.exists()) {
				return null;
			}
			@Pc(13) int local13 = (int) local4.length();
			@Pc(16) byte[] local16 = new byte[local13];
			@Pc(27) DataInputStream local27 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local27.readFully(local16, 0, local13);
			local27.close();
			return local16;
		} catch (@Pc(37) IOException local37) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(3) int local3 = 32;
			this.anInt2703 = Integer.parseInt(this.getParameter("width"));
			this.anInt2702 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local3 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			try {
				this.aClass68_1 = new Class68(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local3, "runescape", 12);
			} catch (@Pc(42) Exception local42) {
				this.method1687("nocache");
				return;
			}
			@Pc(51) ClassLoader_Sub1 local51 = new ClassLoader_Sub1();
			@Pc(73) byte[] local73;
			try {
				Class.forName("java.util.jar.Pack200");
				local73 = this.method1689("runescape.pack200?crc=1355614100", "game code", 189741, this.aClass68_1.aString13 + "main_file_cache.dat0");
				if (local73 == null) {
					return;
				}
				local51.aClass65_1 = new Class65_Sub1(local73);
			} catch (@Pc(87) Throwable local87) {
			}
			@Pc(123) Class local123;
			if (local51.aClass65_1 == null) {
				local73 = this.method1689("unpackclass.jar?crc=1734823955", "unpacker", 17829, this.aClass68_1.aString11 + "shared_game_unpacker.dat");
				if (local73 == null) {
					return;
				}
				local51.aClass65_1 = new Class65(local73);
				local123 = Class.forName("Class65");
				local51.aHashtable1.put(local123.getName(), local123);
				@Pc(134) Class local134 = local51.loadClass("unpackclass");
				local51 = new ClassLoader_Sub1();
				local73 = this.method1689("runescape.js5?crc=1398872230", "game code", 201416, this.aClass68_1.aString13 + "main_file_cache.dat1");
				if (local73 == null) {
					return;
				}
				local51.aClass65_1 = (Class65) local134.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local73, Boolean.TRUE);
			}
			local123 = Class.forName("Class67");
			local51.aHashtable1.put(local123.getName(), local123);
			@Pc(201) Class local201 = Class.forName("Class68");
			local51.aHashtable1.put(local201.getName(), local201);
			local123 = Class.forName("Class66");
			local51.aHashtable1.put(local123.getName(), local123);
			local123 = Class.forName("Interface5");
			local51.aHashtable1.put(local123.getName(), local123);
			local123 = Class.forName("Interface6");
			local51.aHashtable1.put(local123.getName(), local123);
			local123 = local51.loadClass("client");
			this.anApplet2 = (Applet) local123.getDeclaredConstructor().newInstance();
			local123.getMethod("providesignlink", local201).invoke(null, this.aClass68_1);
			this.anApplet2.init();
			this.anApplet2.start();
		} catch (@Pc(274) Exception local274) {
			RuntimeException_Sub2.anInt2698 = 1398872230;
			if (local274 instanceof InvocationTargetException) {
				@Pc(290) Throwable local290 = ((InvocationTargetException) local274).getTargetException();
				if (local290 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method1677(this, local274.toString(), local290);
			} else {
				RuntimeException_Sub2.method1677(this, null, local274);
			}
			this.method1687("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)[B")
	private byte[] method1689(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(12) byte[] local12 = this.method1688(arg3);
		if (!this.method1686(arg0, local12)) {
			local12 = this.method1684(arg0, arg1, false, arg2);
			if (local12 == null) {
				local12 = this.method1684(arg0, arg1, true, arg2);
			}
			if (local12 == null) {
				this.method1687("download");
				return null;
			}
			if (!this.method1685(local12, arg3)) {
				return null;
			}
			local12 = this.method1688(arg3);
			if (!this.method1686(arg0, local12)) {
				this.method1687("mismatch");
				return null;
			}
		}
		return local12;
	}
}
