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
	private int anInt2969;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt2970;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Lloader!ra;")
	private Class70 aClass70_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean139;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;Z)Z")
	private boolean method1955(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(11) MessageDigest local11 = MessageDigest.getInstance("SHA");
			local11.reset();
			local11.update(arg0);
			@Pc(19) byte[] local19 = local11.digest();
			if (arg1 == "runescape.pack200?crc=-358417086") {
				if (local19[0] != 81 || local19[1] != -90 || local19[2] != 8 || local19[3] != -66 || local19[4] != 77 || local19[5] != -50 || local19[6] != 17 || local19[7] != -20 || local19[8] != 111 || local19[9] != -10 || local19[10] != 62 || local19[11] != 98 || local19[12] != -38 || local19[13] != -126 || local19[14] != 14 || local19[15] != 21 || local19[16] != -42 || local19[17] != 26 || local19[18] != -53 || local19[19] != -101) {
					return false;
				}
			} else if (arg1 == "runescape.js5?crc=825952803") {
				if (local19[0] != -64 || local19[1] != 109 || local19[2] != 31 || local19[3] != -48 || local19[4] != 33 || local19[5] != 58 || local19[6] != -41 || local19[7] != 51 || local19[8] != -116 || local19[9] != -20 || local19[10] != -18 || local19[11] != 8 || local19[12] != -5 || local19[13] != 80 || local19[14] != 40 || local19[15] != -43 || local19[16] != -70 || local19[17] != 53 || local19[18] != -93 || local19[19] != 56) {
					return false;
				}
			} else if (local19[0] != 3 || local19[1] != -21 || local19[2] != 65 || local19[3] != -60 || local19[4] != -33 || local19[5] != -24 || local19[6] != 92 || local19[7] != 4 || local19[8] != -2 || local19[9] != 48 || local19[10] != 106 || local19[11] != 50 || local19[12] != -46 || local19[13] != -31 || local19[14] != -44 || local19[15] != 120 || local19[16] != -104 || local19[17] != 72 || local19[18] != 50 || local19[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(407) Exception local407) {
			this.method1958("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method1956(@OriginalArg(0) String arg0) {
		try {
			@Pc(4) File local4 = new File(arg0);
			if (!local4.exists()) {
				return null;
			}
			@Pc(18) int local18 = (int) local4.length();
			@Pc(21) byte[] local21 = new byte[local18];
			@Pc(32) DataInputStream local32 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local32.readFully(local21, 0, local18);
			local32.close();
			return local21;
		} catch (@Pc(42) IOException local42) {
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

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(3) int local3 = 32;
			this.anInt2969 = Integer.parseInt(this.getParameter("width"));
			this.anInt2970 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local3 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			try {
				this.aClass70_1 = new Class70(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local3, "runescape", 14);
			} catch (@Pc(42) Exception local42) {
				this.method1958("nocache");
				return;
			}
			@Pc(53) ClassLoader_Sub1 local53 = new ClassLoader_Sub1();
			@Pc(73) byte[] local73;
			try {
				Class.forName("java.util.jar.Pack200");
				local73 = this.method1957("game code", "runescape.pack200?crc=-358417086", 211039, this.aClass70_1.aString14 + "main_file_cache.dat0");
				if (local73 == null) {
					return;
				}
				local53.aClass69_1 = new Class69_Sub1(local73);
			} catch (@Pc(84) Throwable local84) {
			}
			@Pc(120) Class local120;
			if (local53.aClass69_1 == null) {
				local73 = this.method1957("unpacker", "unpackclass.jar?crc=-549807395", 17836, this.aClass70_1.aString13 + "shared_game_unpacker.dat");
				if (local73 == null) {
					return;
				}
				local53.aClass69_1 = new Class69(local73);
				local120 = Class.forName("Class69");
				local53.aHashtable3.put(local120.getName(), local120);
				@Pc(131) Class local131 = local53.loadClass("unpackclass");
				local53 = new ClassLoader_Sub1();
				local73 = this.method1957("game code", "runescape.js5?crc=825952803", 227143, this.aClass70_1.aString14 + "main_file_cache.dat1");
				if (local73 == null) {
					return;
				}
				local53.aClass69_1 = (Class69) local131.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local73, Boolean.TRUE);
			}
			local120 = Class.forName("Class71");
			local53.aHashtable3.put(local120.getName(), local120);
			@Pc(195) Class local195 = Class.forName("Class70");
			local53.aHashtable3.put(local195.getName(), local195);
			local120 = Class.forName("Class72");
			local53.aHashtable3.put(local120.getName(), local120);
			local120 = Class.forName("Interface6");
			local53.aHashtable3.put(local120.getName(), local120);
			local120 = Class.forName("Interface5");
			local53.aHashtable3.put(local120.getName(), local120);
			local120 = local53.loadClass("client");
			this.anApplet2 = (Applet) local120.getDeclaredConstructor().newInstance();
			local120.getMethod("providesignlink", local195).invoke(null, this.aClass70_1);
			this.anApplet2.init();
			this.anApplet2.start();
		} catch (@Pc(268) Exception local268) {
			RuntimeException_Sub2.anInt2968 = 825952803;
			if (local268 instanceof InvocationTargetException) {
				@Pc(284) Throwable local284 = ((InvocationTargetException) local268).getTargetException();
				if (local284 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method1947(this, local268.toString(), local284);
			} else {
				RuntimeException_Sub2.method1947(this, null, local268);
			}
			this.method1958("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)[B")
	private byte[] method1957(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(12) byte[] local12 = this.method1956(arg3);
		if (!this.method1955(local12, arg1)) {
			local12 = this.method1960(arg0, false, arg2, arg1);
			if (local12 == null) {
				local12 = this.method1960(arg0, true, arg2, arg1);
			}
			if (local12 == null) {
				this.method1958("download");
				return null;
			}
			if (!this.method1959(local12, arg3)) {
				return null;
			}
			local12 = this.method1956(arg3);
			if (!this.method1955(local12, arg1)) {
				this.method1958("mismatch");
				return null;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method1958(@OriginalArg(1) String arg0) {
		if (this.aBoolean139) {
			return;
		}
		this.aBoolean139 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(32) Exception local32) {
		}
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BZLjava/lang/String;)Z")
	private boolean method1959(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method1958("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ZIBLjava/lang/String;)[B")
	private byte[] method1960(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(14) Font local14 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local14);
		@Pc(23) Color local23 = new Color(9179409);
		@Pc(26) byte[] local26 = new byte[arg2];
		try {
			@Pc(36) InputStream local36;
			if (arg1) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg3 + "\n\n").getBytes());
				local36 = local49.getInputStream();
			} else {
				local36 = (new URL(this.getCodeBase(), arg3)).openStream();
			}
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = 0;
			while (local26.length > local81) {
				@Pc(95) int local95 = local26.length - local81;
				if (local95 > 1000) {
					local95 = 1000;
				}
				@Pc(106) int local106 = local36.read(local26, local81, local95);
				if (local106 < 0) {
					throw new EOFException();
				}
				local81 += local106;
				@Pc(124) int local124 = local81 * 100 / local26.length;
				if (local124 != local79) {
					try {
						@Pc(132) Graphics local132 = this.getGraphics();
						if (local132 == null) {
							this.repaint();
						} else {
							local79 = local124;
							@Pc(155) String local155 = "Loading " + arg0 + " - " + local124 + "%";
							local132.setColor(Color.black);
							local132.fillRect(0, 0, this.anInt2969, this.anInt2970);
							local132.setColor(local23);
							local132.drawRect(this.anInt2969 / 2 - 152, this.anInt2970 / 2 - 18, 303, 33);
							local132.setFont(local14);
							local132.setColor(Color.white);
							local132.drawString(local155, (this.anInt2969 - local18.stringWidth(local155)) / 2, this.anInt2970 / 2 + 4);
						}
					} catch (@Pc(211) Exception local211) {
					}
				}
			}
			local36.close();
		} catch (@Pc(217) IOException local217) {
			return null;
		}
		return this.method1955(local26, arg3) ? local26 : null;
	}
}
