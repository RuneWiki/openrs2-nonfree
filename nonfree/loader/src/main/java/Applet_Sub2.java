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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Lloader!ma;")
	private Class92 aClass92_1;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt4613;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt4614;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean185;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean187;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean186;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean188;

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt4613 = Integer.parseInt(this.getParameter("width"));
			this.anInt4614 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(44) Exception local44) {
			}
			try {
				this.aClass92_1 = new Class92(true, this, local1, "runescape", 16);
			} catch (@Pc(56) Exception local56) {
				this.method3037("nocache");
				return;
			}
			@Pc(67) ClassLoader_Sub1 local67 = new ClassLoader_Sub1();
			@Pc(84) byte[] local84;
			try {
				Class.forName("java.util.jar.Pack200");
				local84 = this.method3035("runescape_-1851810180.pack200", local26, 272716, new File(this.aClass92_1.aFile5, "main_file_cache.dat0"));
				if (local84 == null) {
					return;
				}
				local67.aClass90_1 = new Class90_Sub1(local84);
			} catch (@Pc(96) Throwable local96) {
			}
			@Pc(126) Class local126;
			if (local67.aClass90_1 == null) {
				local84 = this.method3035("unpackclass_-163111980.jar", local28, 19185, new File(this.aClass92_1.aFile5, "game_unpacker.dat"));
				if (local84 == null) {
					return;
				}
				local67.aClass90_1 = new Class90(local84);
				local126 = Class.forName("Class90");
				local67.aHashtable1.put(local126.getName(), local126);
				@Pc(137) Class local137 = local67.loadClass("unpackclass");
				local67 = new ClassLoader_Sub1();
				local84 = this.method3035("runescape_-726435627.js5", local26, 283350, new File(this.aClass92_1.aFile5, "main_file_cache.dat1"));
				if (local84 == null) {
					return;
				}
				local67.aClass90_1 = (Class90) local137.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local84, Boolean.TRUE);
			}
			local126 = Class.forName("Class91");
			local67.aHashtable1.put(local126.getName(), local126);
			@Pc(199) Class local199 = Class.forName("Class92");
			local67.aHashtable1.put(local199.getName(), local199);
			local126 = Class.forName("Class93");
			local67.aHashtable1.put(local126.getName(), local126);
			local126 = Class.forName("Interface4");
			local67.aHashtable1.put(local126.getName(), local126);
			local126 = local67.loadClass("client");
			synchronized (this) {
				if (this.aBoolean186) {
					return;
				}
				this.anApplet2 = (Applet) local126.getDeclaredConstructor().newInstance();
				local126.getMethod("providesignlink", local199).invoke(null, this.aClass92_1);
				this.anApplet2.init();
				if (this.aBoolean188) {
					this.anApplet2.start();
				}
				if (this.aBoolean187) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(290) Exception local290) {
			RuntimeException_Sub2.anInt4611 = -726435627;
			if (local290 instanceof InvocationTargetException) {
				@Pc(299) Throwable local299 = ((InvocationTargetException) local290).getTargetException();
				if (local299 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3023(this, local299, local290.toString());
			} else {
				RuntimeException_Sub2.method3023(this, local290, null);
			}
			this.method3037("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/io/File;Z)[B")
	private byte[] method3035(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) File arg3) {
		@Pc(9) byte[] local9 = this.method3036(arg3);
		if (!this.method3038(arg0, local9)) {
			local9 = this.method3039(arg0, arg2, arg1, false);
			if (local9 == null) {
				local9 = this.method3039(arg0, arg2, arg1, true);
			}
			if (local9 == null) {
				this.method3037("download");
				return null;
			}
			if (!this.method3040(arg3, local9)) {
				return null;
			}
			local9 = this.method3036(arg3);
			if (!this.method3038(arg0, local9)) {
				this.method3037("mismatch");
				return null;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean187 = false;
		this.aBoolean188 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method3036(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(12) byte[] local12 = new byte[local9];
			@Pc(30) DataInputStream local30 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local30.readFully(local12, 0, local9);
			local30.close();
			return local12;
		} catch (@Pc(40) IOException local40) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method3037(@OriginalArg(0) String arg0) {
		if (this.aBoolean185) {
			return;
		}
		this.aBoolean185 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean188 = this.aBoolean187 = false;
		this.aBoolean186 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;[B)Z")
	private boolean method3038(@OriginalArg(1) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(15) MessageDigest local15 = MessageDigest.getInstance("SHA");
			local15.reset();
			local15.update(arg1);
			@Pc(23) byte[] local23 = local15.digest();
			if (arg0 == "runescape_-1851810180.pack200") {
				if (local23[0] != 32 || local23[1] != 107 || local23[2] != -82 || local23[3] != -118 || local23[4] != -51 || local23[5] != -106 || local23[6] != -38 || local23[7] != -44 || local23[8] != -44 || local23[9] != 23 || local23[10] != 7 || local23[11] != -17 || local23[12] != 97 || local23[13] != -93 || local23[14] != 37 || local23[15] != 25 || local23[16] != -8 || local23[17] != 69 || local23[18] != 60 || local23[19] != -92) {
					return false;
				}
			} else if (arg0 == "runescape_-726435627.js5") {
				if (local23[0] != -34 || local23[1] != -38 || local23[2] != 19 || local23[3] != 19 || local23[4] != -40 || local23[5] != -4 || local23[6] != -120 || local23[7] != -42 || local23[8] != 87 || local23[9] != -21 || local23[10] != 22 || local23[11] != 119 || local23[12] != -35 || local23[13] != 72 || local23[14] != 110 || local23[15] != 107 || local23[16] != -19 || local23[17] != 54 || local23[18] != -41 || local23[19] != 100) {
					return false;
				}
			} else if (local23[0] != 23 || local23[1] != 83 || local23[2] != 57 || local23[3] != 35 || local23[4] != 83 || local23[5] != -48 || local23[6] != 29 || local23[7] != -121 || local23[8] != 101 || local23[9] != 45 || local23[10] != -13 || local23[11] != -62 || local23[12] != -10 || local23[13] != 46 || local23[14] != -57 || local23[15] != -48 || local23[16] != 115 || local23[17] != 102 || local23[18] != 94 || local23[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(387) Exception local387) {
			this.method3037("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean188 = false;
		this.aBoolean187 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean186 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;Z)[B")
	private byte[] method3039(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg1];
		try {
			@Pc(30) InputStream local30;
			if (arg3) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg0 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg0)).openStream();
			}
			@Pc(73) int local73 = -1;
			@Pc(83) int local83 = 0;
			while (local83 < local20.length) {
				@Pc(96) int local96 = local20.length - local83;
				if (local96 > 1000) {
					local96 = 1000;
				}
				@Pc(110) int local110 = local30.read(local20, local83, local96);
				if (local110 < 0) {
					throw new EOFException();
				}
				local83 += local110;
				@Pc(131) int local131 = local83 * 100 / local20.length;
				if (local131 != local73) {
					try {
						@Pc(137) Graphics local137 = this.getGraphics();
						if (local137 == null) {
							this.repaint();
						} else {
							local137.setColor(Color.black);
							@Pc(159) String local159 = arg2 + " - " + local131 + "%";
							local73 = local131;
							local137.fillRect(0, 0, this.anInt4613, this.anInt4614);
							local137.setColor(local17);
							local137.drawRect(this.anInt4613 / 2 - 152, this.anInt4614 / 2 + -18, 303, 33);
							local137.setFont(local8);
							local137.setColor(Color.white);
							local137.drawString(local159, (this.anInt4613 - local12.stringWidth(local159)) / 2, this.anInt4614 / 2 + 4);
						}
					} catch (@Pc(214) Exception local214) {
					}
				}
			}
			local30.close();
		} catch (@Pc(220) IOException local220) {
			return null;
		}
		return this.method3038(arg0, local20) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BB)Z")
	private boolean method3040(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg0);
			local10.write(arg1, 0, arg1.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method3037("savefile");
			return false;
		}
	}
}
