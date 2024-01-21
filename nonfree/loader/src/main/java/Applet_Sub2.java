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
	private int anInt4583;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt4584;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Lloader!gg;")
	private Class94 aClass94_1;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean180;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean181;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean183;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean182;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean180 = true;
		this.aBoolean182 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt4583 = Integer.parseInt(this.getParameter("width"));
			this.anInt4584 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local1 += local18;
			} catch (@Pc(24) Exception local24) {
			}
			@Pc(26) String local26 = "Loading unpacker";
			@Pc(28) String local28 = "Loading game code";
			try {
				@Pc(32) String local32 = this.getParameter("lang");
				if (local32 != null && local32.equals("1")) {
					local28 = "Lade Spiel-Code";
					local26 = "Lade Entpacker";
				}
			} catch (@Pc(45) Exception local45) {
			}
			try {
				this.aClass94_1 = new Class94(true, this, local1, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method3538("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method3541(279578, new File(this.aClass94_1.aFile4, "main_file_cache.dat0"), local28, "runescape_1566573452.pack200");
				if (local85 == null) {
					return;
				}
				local68.aClass92_1 = new Class92_Sub1(local85);
			} catch (@Pc(98) Throwable local98) {
			}
			@Pc(130) Class local130;
			if (local68.aClass92_1 == null) {
				local85 = this.method3541(19185, new File(this.aClass94_1.aFile4, "game_unpacker.dat"), local26, "unpackclass_-163111980.jar");
				if (local85 == null) {
					return;
				}
				local68.aClass92_1 = new Class92(local85);
				local130 = Class.forName("Class92");
				local68.aHashtable1.put(local130.getName(), local130);
				@Pc(141) Class local141 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method3541(291818, new File(this.aClass94_1.aFile4, "main_file_cache.dat1"), local28, "runescape_-217068298.js5");
				if (local85 == null) {
					return;
				}
				local68.aClass92_1 = (Class92) local141.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local130 = Class.forName("Class95");
			local68.aHashtable1.put(local130.getName(), local130);
			@Pc(202) Class local202 = Class.forName("Class94");
			local68.aHashtable1.put(local202.getName(), local202);
			local130 = Class.forName("Class93");
			local68.aHashtable1.put(local130.getName(), local130);
			local130 = Class.forName("Interface4");
			local68.aHashtable1.put(local130.getName(), local130);
			local130 = local68.loadClass("client");
			synchronized (this) {
				if (this.aBoolean183) {
					return;
				}
				this.anApplet3 = (Applet) local130.getDeclaredConstructor().newInstance();
				local130.getMethod("providesignlink", local202).invoke(null, this.aClass94_1);
				this.anApplet3.init();
				if (this.aBoolean182) {
					this.anApplet3.start();
				}
				if (this.aBoolean180) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(295) Exception local295) {
			RuntimeException_Sub2.anInt4578 = -217068298;
			if (local295 instanceof InvocationTargetException) {
				@Pc(311) Throwable local311 = ((InvocationTargetException) local295).getTargetException();
				if (local311 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3524(this, local311, local295.toString());
			} else {
				RuntimeException_Sub2.method3524(this, local295, null);
			}
			this.method3538("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method3538(@OriginalArg(1) String arg0) {
		if (this.aBoolean181) {
			return;
		}
		this.aBoolean181 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(30) Exception local30) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean182 = true;
		this.aBoolean180 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method3539(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean183 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;I)Z")
	private boolean method3540(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(13) MessageDigest local13 = MessageDigest.getInstance("SHA");
			local13.reset();
			local13.update(arg0);
			@Pc(21) byte[] local21 = local13.digest();
			if (arg1 == "runescape_1566573452.pack200") {
				if (local21[0] != -120 || local21[1] != 49 || local21[2] != -109 || local21[3] != 84 || local21[4] != 93 || local21[5] != 118 || local21[6] != -81 || local21[7] != 72 || local21[8] != -44 || local21[9] != 123 || local21[10] != 19 || local21[11] != 64 || local21[12] != 70 || local21[13] != 122 || local21[14] != -54 || local21[15] != 47 || local21[16] != -90 || local21[17] != 40 || local21[18] != 95 || local21[19] != -103) {
					return false;
				}
			} else if (arg1 == "runescape_-217068298.js5") {
				if (local21[0] != -112 || local21[1] != -98 || local21[2] != 33 || local21[3] != 65 || local21[4] != -59 || local21[5] != 62 || local21[6] != -89 || local21[7] != 18 || local21[8] != -29 || local21[9] != 79 || local21[10] != 119 || local21[11] != -8 || local21[12] != 69 || local21[13] != -4 || local21[14] != -100 || local21[15] != 23 || local21[16] != -89 || local21[17] != -48 || local21[18] != 54 || local21[19] != 21) {
					return false;
				}
			} else if (local21[0] != 23 || local21[1] != 83 || local21[2] != 57 || local21[3] != 35 || local21[4] != 83 || local21[5] != -48 || local21[6] != 29 || local21[7] != -121 || local21[8] != 101 || local21[9] != 45 || local21[10] != -13 || local21[11] != -62 || local21[12] != -10 || local21[13] != 46 || local21[14] != -57 || local21[15] != -48 || local21[16] != 115 || local21[17] != 102 || local21[18] != 94 || local21[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(386) Exception local386) {
			this.method3538("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/io/File;Ljava/lang/String;Ljava/lang/String;)[B")
	private byte[] method3541(@OriginalArg(1) int arg0, @OriginalArg(2) File arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = this.method3539(arg1);
		if (!this.method3540(local4, arg3)) {
			local4 = this.method3542(false, arg3, arg0, arg2);
			if (local4 == null) {
				local4 = this.method3542(true, arg3, arg0, arg2);
			}
			if (local4 == null) {
				this.method3538("download");
				return null;
			}
			if (!this.method3543(local4, arg1)) {
				return null;
			}
			local4 = this.method3539(arg1);
			if (!this.method3540(local4, arg3)) {
				this.method3538("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean183 = true;
		this.aBoolean182 = this.aBoolean180 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;IBLjava/lang/String;)[B")
	private byte[] method3542(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(14) Font local14 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local14);
		@Pc(23) Color local23 = new Color(9179409);
		@Pc(26) byte[] local26 = new byte[arg2];
		try {
			@Pc(67) InputStream local67;
			if (arg0) {
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
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = 0;
			while (local26.length > local81) {
				@Pc(91) int local91 = local26.length - local81;
				if (local91 > 1000) {
					local91 = 1000;
				}
				@Pc(105) int local105 = local67.read(local26, local81, local91);
				if (local105 < 0) {
					throw new EOFException();
				}
				local81 += local105;
				@Pc(124) int local124 = local81 * 100 / local26.length;
				if (local79 != local124) {
					try {
						@Pc(134) Graphics local134 = this.getGraphics();
						if (local134 == null) {
							this.repaint();
						} else {
							local79 = local124;
							local134.setColor(Color.black);
							local134.fillRect(0, 0, this.anInt4583, this.anInt4584);
							@Pc(163) String local163 = arg3 + " - " + local124 + "%";
							local134.setColor(local23);
							local134.drawRect(this.anInt4583 / 2 - 152, this.anInt4584 / 2 + -18, 303, 33);
							local134.setFont(local14);
							local134.setColor(Color.white);
							local134.drawString(local163, (this.anInt4583 - local18.stringWidth(local163)) / 2, this.anInt4584 / 2 + 4);
						}
					} catch (@Pc(211) Exception local211) {
					}
				}
			}
			local67.close();
		} catch (@Pc(217) IOException local217) {
			return null;
		}
		return this.method3540(local26, arg1) ? local26 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method3543(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method3538("savefile");
			return false;
		}
	}
}
