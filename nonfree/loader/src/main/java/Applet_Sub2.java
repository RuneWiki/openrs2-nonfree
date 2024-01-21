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
	private int anInt2865;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Lloader!jc;")
	private Class68 aClass68_1;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt2866;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean176;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;[B)Z")
	private boolean method1917(@OriginalArg(1) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			if (arg0 == "runescape.pack200?crc=41272551") {
				if (local17[0] != -54 || local17[1] != -8 || local17[2] != 81 || local17[3] != 109 || local17[4] != -116 || local17[5] != 114 || local17[6] != 8 || local17[7] != -91 || local17[8] != -7 || local17[9] != -58 || local17[10] != 100 || local17[11] != -1 || local17[12] != 108 || local17[13] != -15 || local17[14] != -60 || local17[15] != -119 || local17[16] != -48 || local17[17] != 102 || local17[18] != 91 || local17[19] != -31) {
					return false;
				}
			} else if (arg0 == "runescape.js5?crc=690556138") {
				if (local17[0] != -97 || local17[1] != 68 || local17[2] != -21 || local17[3] != -114 || local17[4] != -113 || local17[5] != -28 || local17[6] != 9 || local17[7] != -124 || local17[8] != 44 || local17[9] != 120 || local17[10] != 23 || local17[11] != -8 || local17[12] != 21 || local17[13] != -82 || local17[14] != 84 || local17[15] != -46 || local17[16] != 46 || local17[17] != -126 || local17[18] != -21 || local17[19] != 95) {
					return false;
				}
			} else if (local17[0] != 31 || local17[1] != 17 || local17[2] != -1 || local17[3] != -10 || local17[4] != -32 || local17[5] != -13 || local17[6] != -50 || local17[7] != 82 || local17[8] != 69 || local17[9] != -65 || local17[10] != 18 || local17[11] != -120 || local17[12] != -27 || local17[13] != -13 || local17[14] != -56 || local17[15] != -126 || local17[16] != -39 || local17[17] != 24 || local17[18] != 25 || local17[19] != -119) {
				return false;
			}
			return true;
		} catch (@Pc(393) Exception local393) {
			this.method1918("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method1918(@OriginalArg(1) String arg0) {
		if (this.aBoolean176) {
			return;
		}
		this.aBoolean176 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(34) Exception local34) {
		}
	}

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
			this.anInt2866 = Integer.parseInt(this.getParameter("width"));
			this.anInt2865 = Integer.parseInt(this.getParameter("height"));
			@Pc(15) int local15 = 32;
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local15 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			try {
				this.aClass68_1 = new Class68(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local15, "runescape", 12);
			} catch (@Pc(42) Exception local42) {
				this.method1918("nocache");
				return;
			}
			@Pc(53) ClassLoader_Sub1 local53 = new ClassLoader_Sub1();
			@Pc(73) byte[] local73;
			try {
				Class.forName("java.util.jar.Pack200");
				local73 = this.method1919("game code", "runescape.pack200?crc=41272551", this.aClass68_1.aString15 + "main_file_cache.dat0", 196251);
				if (local73 == null) {
					return;
				}
				local53.aClass67_1 = new Class67_Sub1(local73);
			} catch (@Pc(84) Throwable local84) {
			}
			@Pc(117) Class local117;
			if (local53.aClass67_1 == null) {
				local73 = this.method1919("unpacker", "unpackclass.jar?crc=1734823955", this.aClass68_1.aString13 + "shared_game_unpacker.dat", 17829);
				if (local73 == null) {
					return;
				}
				local53.aClass67_1 = new Class67(local73);
				local117 = Class.forName("Class67");
				local53.aHashtable1.put(local117.getName(), local117);
				@Pc(128) Class local128 = local53.loadClass("unpackclass");
				local53 = new ClassLoader_Sub1();
				local73 = this.method1919("game code", "runescape.js5?crc=690556138", this.aClass68_1.aString15 + "main_file_cache.dat1", 209516);
				if (local73 == null) {
					return;
				}
				local53.aClass67_1 = (Class67) local128.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local73, Boolean.TRUE);
			}
			local117 = Class.forName("Class66");
			local53.aHashtable1.put(local117.getName(), local117);
			@Pc(195) Class local195 = Class.forName("Class68");
			local53.aHashtable1.put(local195.getName(), local195);
			local117 = Class.forName("Class69");
			local53.aHashtable1.put(local117.getName(), local117);
			local117 = Class.forName("Interface5");
			local53.aHashtable1.put(local117.getName(), local117);
			local117 = Class.forName("Interface6");
			local53.aHashtable1.put(local117.getName(), local117);
			local117 = local53.loadClass("client");
			this.anApplet3 = (Applet) local117.getDeclaredConstructor().newInstance();
			local117.getMethod("providesignlink", local195).invoke(null, this.aClass68_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(268) Exception local268) {
			RuntimeException_Sub2.anInt2861 = 690556138;
			if (local268 instanceof InvocationTargetException) {
				@Pc(284) Throwable local284 = ((InvocationTargetException) local268).getTargetException();
				if (local284 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method1882(local268.toString(), this, local284);
			} else {
				RuntimeException_Sub2.method1882(null, this, local268);
			}
			this.method1918("crash");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)[B")
	private byte[] method1919(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(6) byte[] local6 = this.method1922(arg2);
		if (!this.method1917(arg1, local6)) {
			local6 = this.method1921(arg3, arg0, false, arg1);
			if (local6 == null) {
				local6 = this.method1921(arg3, arg0, true, arg1);
			}
			if (local6 == null) {
				this.method1918("download");
				return null;
			}
			if (!this.method1920(local6, arg2)) {
				return null;
			}
			local6 = this.method1922(arg2);
			if (!this.method1917(arg1, local6)) {
				this.method1918("mismatch");
				return null;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/lang/String;)Z")
	private boolean method1920(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method1918("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;BZLjava/lang/String;)[B")
	private byte[] method1921(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg0];
		try {
			@Pc(56) InputStream local56;
			if (arg2) {
				@Pc(31) Socket local31 = new Socket(InetAddress.getByName(this.getCodeBase().getHost()), 443);
				local31.setSoTimeout(10000);
				@Pc(37) OutputStream local37 = local31.getOutputStream();
				local37.write(17);
				local37.write(("JAGGRAB /" + arg3 + "\n\n").getBytes());
				local56 = local31.getInputStream();
			} else {
				local56 = (new URL(this.getCodeBase(), arg3)).openStream();
			}
			@Pc(68) int local68 = -1;
			@Pc(70) int local70 = 0;
			while (local70 < local20.length) {
				@Pc(79) int local79 = local20.length - local70;
				if (local79 > 1000) {
					local79 = 1000;
				}
				@Pc(94) int local94 = local56.read(local20, local70, local79);
				if (local94 < 0) {
					throw new EOFException();
				}
				local70 += local94;
				@Pc(111) int local111 = local70 * 100 / local20.length;
				if (local68 != local111) {
					try {
						@Pc(123) Graphics local123 = this.getGraphics();
						if (local123 == null) {
							this.repaint();
						} else {
							local123.setColor(Color.black);
							local123.fillRect(0, 0, this.anInt2866, this.anInt2865);
							local123.setColor(local17);
							local68 = local111;
							local123.drawRect(this.anInt2866 / 2 - 152, this.anInt2865 / 2 + -18, 303, 33);
							@Pc(173) String local173 = "Loading " + arg1 + " - " + local111 + "%";
							local123.setFont(local8);
							local123.setColor(Color.white);
							local123.drawString(local173, (this.anInt2866 - local12.stringWidth(local173)) / 2, this.anInt2865 / 2 + 4);
						}
					} catch (@Pc(203) Exception local203) {
					}
				}
			}
			local56.close();
		} catch (@Pc(209) IOException local209) {
			return null;
		}
		return this.method1917(arg3, local20) ? local20 : null;
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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method1922(@OriginalArg(1) String arg0) {
		try {
			@Pc(4) File local4 = new File(arg0);
			if (!local4.exists()) {
				return null;
			}
			@Pc(13) int local13 = (int) local4.length();
			@Pc(32) DataInputStream local32 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(35) byte[] local35 = new byte[local13];
			local32.readFully(local35, 0, local13);
			local32.close();
			return local35;
		} catch (@Pc(45) IOException local45) {
			return null;
		}
	}
}
