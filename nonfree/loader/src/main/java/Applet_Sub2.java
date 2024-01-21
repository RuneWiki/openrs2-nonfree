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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Lloader!ba;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt2900;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt2901;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean132;

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IZ)[B")
	private byte[] method2002(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local8);
		@Pc(23) Color local23 = new Color(9179409);
		@Pc(26) byte[] local26 = new byte[arg2];
		try {
			@Pc(67) InputStream local67;
			if (arg3) {
				@Pc(31) URL local31 = this.getCodeBase();
				@Pc(39) Socket local39 = new Socket(InetAddress.getByName(local31.getHost()), 443);
				local39.setSoTimeout(10000);
				@Pc(45) OutputStream local45 = local39.getOutputStream();
				local45.write(17);
				local45.write(("JAGGRAB " + local31.getFile() + arg1 + "\n\n").getBytes());
				local67 = local39.getInputStream();
			} else {
				local67 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(79) int local79 = 0;
			@Pc(81) int local81 = -1;
			while (local79 < local26.length) {
				@Pc(91) int local91 = local26.length - local79;
				if (local91 > 1000) {
					local91 = 1000;
				}
				@Pc(102) int local102 = local67.read(local26, local79, local91);
				if (local102 < 0) {
					throw new EOFException();
				}
				local79 += local102;
				@Pc(123) int local123 = local79 * 100 / local26.length;
				if (local123 != local81) {
					try {
						@Pc(134) Graphics local134 = this.getGraphics();
						if (local134 == null) {
							this.repaint();
						} else {
							local81 = local123;
							local134.setColor(Color.black);
							local134.fillRect(0, 0, this.anInt2901, this.anInt2900);
							local134.setColor(local23);
							local134.drawRect(this.anInt2901 / 2 - 152, this.anInt2900 / 2 + -18, 303, 33);
							@Pc(186) String local186 = arg0 + " - " + local123 + "%";
							local134.setFont(local8);
							local134.setColor(Color.white);
							local134.drawString(local186, (this.anInt2901 - local18.stringWidth(local186)) / 2, this.anInt2900 / 2 + 4);
						}
					} catch (@Pc(211) Exception local211) {
					}
				}
			}
			local67.close();
		} catch (@Pc(217) IOException local217) {
			return null;
		}
		return this.method2007(local26, arg1) ? local26 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt2901 = Integer.parseInt(this.getParameter("width"));
			@Pc(7) int local7 = 32;
			this.anInt2900 = Integer.parseInt(this.getParameter("height"));
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
					local28 = "Lade Entpacker";
					local26 = "Lade Spiel-Code";
				}
			} catch (@Pc(46) Exception local46) {
			}
			try {
				this.aClass81_1 = new Class81(true, this, local7, "runescape", 16);
			} catch (@Pc(58) Exception local58) {
				this.method2005("nocache");
				return;
			}
			@Pc(69) ClassLoader_Sub1 local69 = new ClassLoader_Sub1();
			@Pc(86) byte[] local86;
			try {
				Class.forName("java.util.jar.Pack200");
				local86 = this.method2004(239313, new File(this.aClass81_1.aFile5, "main_file_cache.dat0"), "runescape.pack200?crc=-137972916", local26);
				if (local86 == null) {
					return;
				}
				local69.aClass82_1 = new Class82_Sub1(local86);
			} catch (@Pc(99) Throwable local99) {
			}
			@Pc(129) Class local129;
			if (local69.aClass82_1 == null) {
				local86 = this.method2004(17836, new File(this.aClass81_1.aFile5, "game_unpacker.dat"), "unpackclass.jar?crc=-549807395", local28);
				if (local86 == null) {
					return;
				}
				local69.aClass82_1 = new Class82(local86);
				local129 = Class.forName("Class82");
				local69.aHashtable1.put(local129.getName(), local129);
				@Pc(140) Class local140 = local69.loadClass("unpackclass");
				local69 = new ClassLoader_Sub1();
				local86 = this.method2004(253477, new File(this.aClass81_1.aFile5, "main_file_cache.dat1"), "runescape.js5?crc=-1723077783", local26);
				if (local86 == null) {
					return;
				}
				local69.aClass82_1 = (Class82) local140.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local86, Boolean.TRUE);
			}
			local129 = Class.forName("Class83");
			local69.aHashtable1.put(local129.getName(), local129);
			@Pc(201) Class local201 = Class.forName("Class81");
			local69.aHashtable1.put(local201.getName(), local201);
			local129 = Class.forName("Class84");
			local69.aHashtable1.put(local129.getName(), local129);
			local129 = Class.forName("Interface4");
			local69.aHashtable1.put(local129.getName(), local129);
			local129 = local69.loadClass("client");
			this.anApplet3 = (Applet) local129.getDeclaredConstructor().newInstance();
			local129.getMethod("providesignlink", local201).invoke(null, this.aClass81_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(264) Exception local264) {
			RuntimeException_Sub2.anInt2893 = -1723077783;
			if (local264 instanceof InvocationTargetException) {
				@Pc(273) Throwable local273 = ((InvocationTargetException) local264).getTargetException();
				if (local273 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method1976(local273, this, local264.toString());
			} else {
				RuntimeException_Sub2.method1976(local264, this, null);
			}
			this.method2005("crash");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2003(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(24) DataInputStream local24 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(27) byte[] local27 = new byte[local8];
			local24.readFully(local27, 0, local8);
			local24.close();
			return local27;
		} catch (@Pc(37) IOException local37) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;ZLjava/lang/String;Ljava/lang/String;)[B")
	private byte[] method2004(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = this.method2003(arg1);
		if (!this.method2007(local4, arg2)) {
			local4 = this.method2002(arg3, arg2, arg0, false);
			if (local4 == null) {
				local4 = this.method2002(arg3, arg2, arg0, true);
			}
			if (local4 == null) {
				this.method2005("download");
				return null;
			}
			if (!this.method2006(arg1, local4)) {
				return null;
			}
			local4 = this.method2003(arg1);
			if (!this.method2007(local4, arg2)) {
				this.method2005("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method2005(@OriginalArg(1) String arg0) {
		if (this.aBoolean132) {
			return;
		}
		this.aBoolean132 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(27) Exception local27) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method2006(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method2005("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/lang/String;)Z")
	private boolean method2007(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(13) MessageDigest local13 = MessageDigest.getInstance("SHA");
			local13.reset();
			local13.update(arg0);
			@Pc(21) byte[] local21 = local13.digest();
			if (arg1 == "runescape.pack200?crc=-137972916") {
				if (local21[0] != 97 || local21[1] != 35 || local21[2] != 80 || local21[3] != 19 || local21[4] != 94 || local21[5] != 63 || local21[6] != -112 || local21[7] != 114 || local21[8] != 85 || local21[9] != 101 || local21[10] != -35 || local21[11] != -60 || local21[12] != -41 || local21[13] != -21 || local21[14] != -69 || local21[15] != -65 || local21[16] != -44 || local21[17] != -80 || local21[18] != 28 || local21[19] != -51) {
					return false;
				}
			} else if (arg1 == "runescape.js5?crc=-1723077783") {
				if (local21[0] != 22 || local21[1] != -85 || local21[2] != -65 || local21[3] != -41 || local21[4] != -23 || local21[5] != -36 || local21[6] != 104 || local21[7] != -24 || local21[8] != 34 || local21[9] != 79 || local21[10] != 125 || local21[11] != 102 || local21[12] != -116 || local21[13] != -67 || local21[14] != -74 || local21[15] != 21 || local21[16] != -46 || local21[17] != 34 || local21[18] != 115 || local21[19] != -63) {
					return false;
				}
			} else if (local21[0] != 3 || local21[1] != -21 || local21[2] != 65 || local21[3] != -60 || local21[4] != -33 || local21[5] != -24 || local21[6] != 92 || local21[7] != 4 || local21[8] != -2 || local21[9] != 48 || local21[10] != 106 || local21[11] != 50 || local21[12] != -46 || local21[13] != -31 || local21[14] != -44 || local21[15] != 120 || local21[16] != -104 || local21[17] != 72 || local21[18] != 50 || local21[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(400) Exception local400) {
			this.method2005("sha");
			return false;
		}
	}
}
