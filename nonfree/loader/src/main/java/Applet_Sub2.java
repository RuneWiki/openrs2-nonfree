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
	private int anInt2783;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt2784;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Lloader!jb;")
	private Class67 aClass67_1;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean132;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method1925(@OriginalArg(0) String arg0) {
		if (this.aBoolean132) {
			return;
		}
		this.aBoolean132 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/lang/String;)Z")
	private boolean method1926(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(13) MessageDigest local13 = MessageDigest.getInstance("SHA");
			local13.reset();
			local13.update(arg0);
			@Pc(21) byte[] local21 = local13.digest();
			if (arg1 == "runescape.pack200?crc=-163076270") {
				if (local21[0] != -16 || local21[1] != 118 || local21[2] != 76 || local21[3] != 65 || local21[4] != 35 || local21[5] != 94 || local21[6] != 69 || local21[7] != -4 || local21[8] != -15 || local21[9] != -44 || local21[10] != 27 || local21[11] != -101 || local21[12] != -40 || local21[13] != -94 || local21[14] != 22 || local21[15] != -26 || local21[16] != 77 || local21[17] != 57 || local21[18] != 52 || local21[19] != 56) {
					return false;
				}
			} else if (arg1 == "runescape.js5?crc=1537445013") {
				if (local21[0] != -82 || local21[1] != 105 || local21[2] != -113 || local21[3] != -88 || local21[4] != 8 || local21[5] != -84 || local21[6] != -28 || local21[7] != -88 || local21[8] != 112 || local21[9] != 80 || local21[10] != -42 || local21[11] != -63 || local21[12] != -100 || local21[13] != 71 || local21[14] != -4 || local21[15] != -79 || local21[16] != 86 || local21[17] != 30 || local21[18] != -50 || local21[19] != -126) {
					return false;
				}
			} else if (local21[0] != 3 || local21[1] != -21 || local21[2] != 65 || local21[3] != -60 || local21[4] != -33 || local21[5] != -24 || local21[6] != 92 || local21[7] != 4 || local21[8] != -2 || local21[9] != 48 || local21[10] != 106 || local21[11] != 50 || local21[12] != -46 || local21[13] != -31 || local21[14] != -44 || local21[15] != 120 || local21[16] != -104 || local21[17] != 72 || local21[18] != 50 || local21[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(401) Exception local401) {
			this.method1925("sha");
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

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;[BB)Z")
	private boolean method1927(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method1925("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B")
	private byte[] method1928(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(13) byte[] local13 = this.method1929(arg1);
		if (!this.method1926(local13, arg3)) {
			local13 = this.method1930(false, arg2, arg3, arg0);
			if (local13 == null) {
				local13 = this.method1930(true, arg2, arg3, arg0);
			}
			if (local13 == null) {
				this.method1925("download");
				return null;
			}
			if (!this.method1927(arg1, local13)) {
				return null;
			}
			local13 = this.method1929(arg1);
			if (!this.method1926(local13, arg3)) {
				this.method1925("mismatch");
				return null;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	private byte[] method1929(@OriginalArg(1) String arg0) {
		try {
			@Pc(4) File local4 = new File(arg0);
			if (!local4.exists()) {
				return null;
			}
			@Pc(15) int local15 = (int) local4.length();
			@Pc(32) DataInputStream local32 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(35) byte[] local35 = new byte[local15];
			local32.readFully(local35, 0, local15);
			local32.close();
			return local35;
		} catch (@Pc(45) IOException local45) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt2783 = Integer.parseInt(this.getParameter("width"));
			this.anInt2784 = Integer.parseInt(this.getParameter("height"));
			@Pc(15) int local15 = 32;
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local15 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			try {
				this.aClass67_1 = new Class67(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local15, "runescape", 12);
			} catch (@Pc(42) Exception local42) {
				this.method1925("nocache");
				return;
			}
			@Pc(53) ClassLoader_Sub1 local53 = new ClassLoader_Sub1();
			@Pc(73) byte[] local73;
			try {
				Class.forName("java.util.jar.Pack200");
				local73 = this.method1928(196939, this.aClass67_1.aString11 + "main_file_cache.dat0", "game code", "runescape.pack200?crc=-163076270");
				if (local73 == null) {
					return;
				}
				local53.aClass66_1 = new Class66_Sub1(local73);
			} catch (@Pc(84) Throwable local84) {
			}
			@Pc(119) Class local119;
			if (local53.aClass66_1 == null) {
				local73 = this.method1928(17836, this.aClass67_1.aString15 + "shared_game_unpacker.dat", "unpacker", "unpackclass.jar?crc=-549807395");
				if (local73 == null) {
					return;
				}
				local53.aClass66_1 = new Class66(local73);
				local119 = Class.forName("Class66");
				local53.aHashtable3.put(local119.getName(), local119);
				@Pc(130) Class local130 = local53.loadClass("unpackclass");
				local53 = new ClassLoader_Sub1();
				local73 = this.method1928(210087, this.aClass67_1.aString11 + "main_file_cache.dat1", "game code", "runescape.js5?crc=1537445013");
				if (local73 == null) {
					return;
				}
				local53.aClass66_1 = (Class66) local130.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local73, Boolean.TRUE);
			}
			local119 = Class.forName("Class68");
			local53.aHashtable3.put(local119.getName(), local119);
			@Pc(194) Class local194 = Class.forName("Class67");
			local53.aHashtable3.put(local194.getName(), local194);
			local119 = Class.forName("Class69");
			local53.aHashtable3.put(local119.getName(), local119);
			local119 = Class.forName("Interface5");
			local53.aHashtable3.put(local119.getName(), local119);
			local119 = Class.forName("Interface6");
			local53.aHashtable3.put(local119.getName(), local119);
			local119 = local53.loadClass("client");
			this.anApplet3 = (Applet) local119.getDeclaredConstructor().newInstance();
			local119.getMethod("providesignlink", local194).invoke(null, this.aClass67_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(267) Exception local267) {
			RuntimeException_Sub2.anInt2779 = 1537445013;
			if (local267 instanceof InvocationTargetException) {
				@Pc(283) Throwable local283 = ((InvocationTargetException) local267).getTargetException();
				if (local283 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method1908(local283, this, local267.toString());
			} else {
				RuntimeException_Sub2.method1908(local267, this, null);
			}
			this.method1925("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;II)[B")
	private byte[] method1930(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(11) byte[] local11 = new byte[arg3];
		@Pc(15) FontMetrics local15 = this.getFontMetrics(local8);
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(30) InputStream local30;
			if (arg0) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg2 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(73) int local73 = -1;
			@Pc(81) int local81 = 0;
			while (local81 < local11.length) {
				@Pc(94) int local94 = local11.length - local81;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(107) int local107 = local30.read(local11, local81, local94);
				if (local107 < 0) {
					throw new EOFException();
				}
				local81 += local107;
				@Pc(129) int local129 = local81 * 100 / local11.length;
				if (local129 != local73) {
					try {
						@Pc(139) Graphics local139 = this.getGraphics();
						if (local139 == null) {
							this.repaint();
						} else {
							local73 = local129;
							local139.setColor(Color.black);
							local139.fillRect(0, 0, this.anInt2783, this.anInt2784);
							local139.setColor(local20);
							local139.drawRect(this.anInt2783 / 2 - 152, this.anInt2784 / 2 + -18, 303, 33);
							@Pc(189) String local189 = "Loading " + arg1 + " - " + local129 + "%";
							local139.setFont(local8);
							local139.setColor(Color.white);
							local139.drawString(local189, (this.anInt2783 - local15.stringWidth(local189)) / 2, this.anInt2784 / 2 + 4);
						}
					} catch (@Pc(218) Exception local218) {
					}
				}
			}
			local30.close();
		} catch (@Pc(224) IOException local224) {
			return null;
		}
		return this.method1926(local11, arg2) ? local11 : null;
	}
}
