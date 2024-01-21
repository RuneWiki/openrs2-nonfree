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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Lloader!kc;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt3236;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt3237;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean174;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3237 = Integer.parseInt(this.getParameter("width"));
			this.anInt3236 = Integer.parseInt(this.getParameter("height"));
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
				this.aClass84_1 = new Class84(true, this, local13, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method2100("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method2101(local26, 240061, new File(this.aClass84_1.aFile6, "main_file_cache.dat0"), "runescape.pack200?crc=1009785038");
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = new Class82_Sub1(local85);
			} catch (@Pc(97) Throwable local97) {
			}
			@Pc(127) Class local127;
			if (local68.aClass82_1 == null) {
				local85 = this.method2101(local28, 17836, new File(this.aClass84_1.aFile6, "game_unpacker.dat"), "unpackclass.jar?crc=-549807395");
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = new Class82(local85);
				local127 = Class.forName("Class82");
				local68.aHashtable1.put(local127.getName(), local127);
				@Pc(138) Class local138 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method2101(local26, 254677, new File(this.aClass84_1.aFile6, "main_file_cache.dat1"), "runescape.js5?crc=1327088514");
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = (Class82) local138.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local127 = Class.forName("Class83");
			local68.aHashtable1.put(local127.getName(), local127);
			@Pc(201) Class local201 = Class.forName("Class84");
			local68.aHashtable1.put(local201.getName(), local201);
			local127 = Class.forName("Class85");
			local68.aHashtable1.put(local127.getName(), local127);
			local127 = Class.forName("Interface4");
			local68.aHashtable1.put(local127.getName(), local127);
			local127 = local68.loadClass("client");
			this.anApplet3 = (Applet) local127.getDeclaredConstructor().newInstance();
			local127.getMethod("providesignlink", local201).invoke(null, this.aClass84_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(264) Exception local264) {
			RuntimeException_Sub2.anInt3233 = 1327088514;
			if (local264 instanceof InvocationTargetException) {
				@Pc(280) Throwable local280 = ((InvocationTargetException) local264).getTargetException();
				if (local280 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2077(local264.toString(), this, local280);
			} else {
				RuntimeException_Sub2.method2077(null, this, local264);
			}
			this.method2100("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;I)Z")
	private boolean method2099(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(12) MessageDigest local12 = MessageDigest.getInstance("SHA");
			local12.reset();
			local12.update(arg0);
			@Pc(20) byte[] local20 = local12.digest();
			if (arg1 == "runescape.pack200?crc=1009785038") {
				if (local20[0] != 5 || local20[1] != 1 || local20[2] != 61 || local20[3] != -9 || local20[4] != -83 || local20[5] != -49 || local20[6] != -44 || local20[7] != -61 || local20[8] != -123 || local20[9] != -106 || local20[10] != 11 || local20[11] != -86 || local20[12] != -60 || local20[13] != 41 || local20[14] != 101 || local20[15] != -32 || local20[16] != -98 || local20[17] != 29 || local20[18] != 53 || local20[19] != -42) {
					return false;
				}
			} else if (arg1 == "runescape.js5?crc=1327088514") {
				if (local20[0] != 125 || local20[1] != 86 || local20[2] != 16 || local20[3] != 85 || local20[4] != 120 || local20[5] != -1 || local20[6] != -63 || local20[7] != -89 || local20[8] != 50 || local20[9] != -99 || local20[10] != 93 || local20[11] != -76 || local20[12] != 110 || local20[13] != -67 || local20[14] != 84 || local20[15] != 53 || local20[16] != -80 || local20[17] != -78 || local20[18] != 46 || local20[19] != -13) {
					return false;
				}
			} else if (local20[0] != 3 || local20[1] != -21 || local20[2] != 65 || local20[3] != -60 || local20[4] != -33 || local20[5] != -24 || local20[6] != 92 || local20[7] != 4 || local20[8] != -2 || local20[9] != 48 || local20[10] != 106 || local20[11] != 50 || local20[12] != -46 || local20[13] != -31 || local20[14] != -44 || local20[15] != 120 || local20[16] != -104 || local20[17] != 72 || local20[18] != 50 || local20[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(385) Exception local385) {
			this.method2100("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method2100(@OriginalArg(1) String arg0) {
		if (this.aBoolean174) {
			return;
		}
		this.aBoolean174 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(36) Exception local36) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ILjava/io/File;Ljava/lang/String;B)[B")
	private byte[] method2101(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) File arg2, @OriginalArg(3) String arg3) {
		@Pc(4) byte[] local4 = this.method2104(arg2);
		if (!this.method2099(local4, arg3)) {
			local4 = this.method2103(arg0, arg3, arg1, false);
			if (local4 == null) {
				local4 = this.method2103(arg0, arg3, arg1, true);
			}
			if (local4 == null) {
				this.method2100("download");
				return null;
			}
			if (!this.method2102(arg2, local4)) {
				return null;
			}
			local4 = this.method2104(arg2);
			if (!this.method2099(local4, arg3)) {
				this.method2100("mismatch");
				return null;
			}
		}
		return local4;
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

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method2102(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method2100("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIZ)[B")
	private byte[] method2103(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(23) Color local23 = new Color(9179409);
		@Pc(26) byte[] local26 = new byte[arg2];
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
			while (local26.length > local81) {
				@Pc(91) int local91 = local26.length - local81;
				if (local91 > 1000) {
					local91 = 1000;
				}
				@Pc(102) int local102 = local36.read(local26, local81, local91);
				if (local102 < 0) {
					throw new EOFException();
				}
				local81 += local102;
				@Pc(119) int local119 = local81 * 100 / local26.length;
				if (local79 != local119) {
					try {
						@Pc(130) Graphics local130 = this.getGraphics();
						if (local130 == null) {
							this.repaint();
						} else {
							local79 = local119;
							local130.setColor(Color.black);
							@Pc(154) String local154 = arg0 + " - " + local119 + "%";
							local130.fillRect(0, 0, this.anInt3237, this.anInt3236);
							local130.setColor(local23);
							local130.drawRect(this.anInt3237 / 2 - 152, this.anInt3236 / 2 + -18, 303, 33);
							local130.setFont(local8);
							local130.setColor(Color.white);
							local130.drawString(local154, (this.anInt3237 - local12.stringWidth(local154)) / 2, this.anInt3236 / 2 + 4);
						}
					} catch (@Pc(206) Exception local206) {
					}
				}
			}
			local36.close();
		} catch (@Pc(212) IOException local212) {
			return null;
		}
		return this.method2099(local26, arg1) ? local26 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2104(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(27) DataInputStream local27 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(30) byte[] local30 = new byte[local8];
			local27.readFully(local30, 0, local8);
			local27.close();
			return local30;
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}
}
