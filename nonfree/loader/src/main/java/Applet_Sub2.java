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
	private int anInt2611;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet4;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt2612;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Lloader!bb;")
	private Class66 aClass66_1;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean189;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;Z)[B", line = 9)
	private byte[] method1781(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(11) byte[] local11 = new byte[arg0];
		@Pc(15) FontMetrics local15 = this.getFontMetrics(local8);
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(56) InputStream local56;
			if (arg3) {
				@Pc(31) Socket local31 = new Socket(InetAddress.getByName(this.getCodeBase().getHost()), 443);
				local31.setSoTimeout(10000);
				@Pc(37) OutputStream local37 = local31.getOutputStream();
				local37.write(17);
				local37.write(("JAGGRAB /" + arg1 + "\n\n").getBytes());
				local56 = local31.getInputStream();
			} else {
				local56 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = 0;
			while (local11.length > local76) {
				@Pc(90) int local90 = local11.length - local76;
				if (local90 > 1000) {
					local90 = 1000;
				}
				@Pc(103) int local103 = local56.read(local11, local76, local90);
				if (local103 < 0) {
					throw new EOFException();
				}
				local76 += local103;
				@Pc(120) int local120 = local76 * 100 / local11.length;
				if (local74 != local120) {
					try {
						@Pc(130) Graphics local130 = this.getGraphics();
						if (local130 == null) {
							this.repaint();
						} else {
							local130.setColor(Color.black);
							@Pc(151) String local151 = "Loading " + arg2 + " - " + local120 + "%";
							local74 = local120;
							local130.fillRect(0, 0, this.anInt2611, this.anInt2612);
							local130.setColor(local20);
							local130.drawRect(this.anInt2611 / 2 - 152, this.anInt2612 / 2 - 18, 303, 33);
							local130.setFont(local8);
							local130.setColor(Color.white);
							local130.drawString(local151, (this.anInt2611 - local15.stringWidth(local151)) / 2, this.anInt2612 / 2 + 4);
						}
					} catch (@Pc(210) Exception local210) {
					}
				}
			}
			local56.close();
		} catch (@Pc(216) IOException local216) {
			return null;
		}
		return this.method1782(local11, arg1) ? local11 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/lang/String;)Z", line = 104)
	private boolean method1782(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(14) MessageDigest local14 = MessageDigest.getInstance("SHA");
			local14.reset();
			local14.update(arg0);
			@Pc(22) byte[] local22 = local14.digest();
			if (arg1 == "runescape.pack200?crc=779526686") {
				if (local22[0] != -111 || local22[1] != 0 || local22[2] != -115 || local22[3] != 13 || local22[4] != 55 || local22[5] != 53 || local22[6] != -56 || local22[7] != -95 || local22[8] != -22 || local22[9] != -56 || local22[10] != 68 || local22[11] != 55 || local22[12] != -113 || local22[13] != -99 || local22[14] != -96 || local22[15] != -125 || local22[16] != 10 || local22[17] != -108 || local22[18] != 9 || local22[19] != -124) {
					return false;
				}
			} else if (arg1 == "runescape.js5?crc=713538378") {
				if (local22[0] != 94 || local22[1] != 61 || local22[2] != 117 || local22[3] != -32 || local22[4] != 11 || local22[5] != -47 || local22[6] != 81 || local22[7] != -1 || local22[8] != -1 || local22[9] != 87 || local22[10] != 4 || local22[11] != -4 || local22[12] != 54 || local22[13] != -123 || local22[14] != 53 || local22[15] != -1 || local22[16] != 56 || local22[17] != -55 || local22[18] != -64 || local22[19] != 38) {
					return false;
				}
			} else if (local22[0] != 31 || local22[1] != 17 || local22[2] != -1 || local22[3] != -10 || local22[4] != -32 || local22[5] != -13 || local22[6] != -50 || local22[7] != 82 || local22[8] != 69 || local22[9] != -65 || local22[10] != 18 || local22[11] != -120 || local22[12] != -27 || local22[13] != -13 || local22[14] != -56 || local22[15] != -126 || local22[16] != -39 || local22[17] != 24 || local22[18] != 25 || local22[19] != -119) {
				return false;
			}
			return true;
		} catch (@Pc(393) Exception local393) {
			this.method1786("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z[BLjava/lang/String;)Z", line = 161)
	private boolean method1783(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg1);
			local10.write(arg0, 0, arg0.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method1786("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 182)
	private byte[] method1784(@OriginalArg(0) String arg0) {
		try {
			@Pc(4) File local4 = new File(arg0);
			if (!local4.exists()) {
				return null;
			}
			@Pc(13) int local13 = (int) local4.length();
			@Pc(24) DataInputStream local24 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(33) byte[] local33 = new byte[local13];
			local24.readFully(local33, 0, local13);
			local24.close();
			return local33;
		} catch (@Pc(43) IOException local43) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V", line = 213)
	@Override
	public void destroy() {
		if (this.anApplet4 != null) {
			this.anApplet4.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V", line = 223)
	@Override
	public void start() {
		if (this.anApplet4 != null) {
			this.anApplet4.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;BI)[B", line = 235)
	private byte[] method1785(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(4) byte[] local4 = this.method1784(arg1);
		if (!this.method1782(local4, arg0)) {
			local4 = this.method1781(arg3, arg0, arg2, false);
			if (local4 == null) {
				local4 = this.method1781(arg3, arg0, arg2, true);
			}
			if (local4 == null) {
				this.method1786("download");
				return null;
			}
			if (!this.method1783(local4, arg1)) {
				return null;
			}
			local4 = this.method1784(arg1);
			if (!this.method1782(local4, arg0)) {
				this.method1786("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 271)
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet4 != null) {
			this.anApplet4.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 282)
	private void method1786(@OriginalArg(0) String arg0) {
		if (this.aBoolean189) {
			return;
		}
		this.aBoolean189 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 303)
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet4 != null) {
			this.anApplet4.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V", line = 313)
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V", line = 321)
	@Override
	public void stop() {
		if (this.anApplet4 != null) {
			this.anApplet4.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V", line = 338)
	@Override
	public void run() {
		try {
			this.anInt2611 = Integer.parseInt(this.getParameter("width"));
			this.anInt2612 = Integer.parseInt(this.getParameter("height"));
			@Pc(15) int local15 = 32;
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local15 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			try {
				this.aClass66_1 = new Class66(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local15, "runescape", 12);
			} catch (@Pc(42) Exception local42) {
				this.method1786("nocache");
				return;
			}
			@Pc(53) ClassLoader_Sub1 local53 = new ClassLoader_Sub1();
			@Pc(73) byte[] local73;
			try {
				Class.forName("java.util.jar.Pack200");
				local73 = this.method1785("runescape.pack200?crc=779526686", this.aClass66_1.aString11 + "main_file_cache.dat0", "game code", 189484);
				if (local73 == null) {
					return;
				}
				local53.aClass65_1 = new Class65_Sub1(local73);
			} catch (@Pc(87) Throwable local87) {
			}
			@Pc(120) Class local120;
			if (local53.aClass65_1 == null) {
				local73 = this.method1785("unpackclass.jar?crc=1734823955", this.aClass66_1.aString13 + "shared_game_unpacker.dat", "unpacker", 17829);
				if (local73 == null) {
					return;
				}
				local53.aClass65_1 = new Class65(local73);
				local120 = Class.forName("Class65");
				local53.aHashtable3.put(local120.getName(), local120);
				@Pc(131) Class local131 = local53.loadClass("unpackclass");
				local53 = new ClassLoader_Sub1();
				local73 = this.method1785("runescape.js5?crc=713538378", this.aClass66_1.aString11 + "main_file_cache.dat1", "game code", 201203);
				if (local73 == null) {
					return;
				}
				local53.aClass65_1 = (Class65) local131.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local73, Boolean.TRUE);
			}
			local120 = Class.forName("Class67");
			local53.aHashtable3.put(local120.getName(), local120);
			@Pc(197) Class local197 = Class.forName("Class66");
			local53.aHashtable3.put(local197.getName(), local197);
			local120 = Class.forName("Class68");
			local53.aHashtable3.put(local120.getName(), local120);
			local120 = Class.forName("Interface5");
			local53.aHashtable3.put(local120.getName(), local120);
			local120 = Class.forName("Interface6");
			local53.aHashtable3.put(local120.getName(), local120);
			local120 = local53.loadClass("client");
			this.anApplet4 = (Applet) local120.getDeclaredConstructor().newInstance();
			local120.getMethod("providesignlink", local197).invoke(null, this.aClass66_1);
			this.anApplet4.init();
			this.anApplet4.start();
		} catch (@Pc(270) Exception local270) {
			RuntimeException_Sub2.anInt2607 = 713538378;
			if (local270 instanceof InvocationTargetException) {
				@Pc(279) Throwable local279 = ((InvocationTargetException) local270).getTargetException();
				if (local279 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method1749(local279, this, local270.toString());
			} else {
				RuntimeException_Sub2.method1749(local270, this, null);
			}
			this.method1786("crash");
		}
	}
}
