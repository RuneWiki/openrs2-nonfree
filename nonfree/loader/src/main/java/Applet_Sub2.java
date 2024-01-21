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
	private int anInt2766;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Lloader!vb;")
	private Class69 aClass69_1;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt2767;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean151;

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)[B")
	private byte[] method1873(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(13) byte[] local13 = this.method1878(arg2);
		if (!this.method1877(local13, arg3)) {
			local13 = this.method1876(arg1, arg0, arg3, false);
			if (local13 == null) {
				local13 = this.method1876(arg1, arg0, arg3, true);
			}
			if (local13 == null) {
				this.method1875("download");
				return null;
			}
			if (!this.method1874(local13, arg2)) {
				return null;
			}
			local13 = this.method1878(arg2);
			if (!this.method1877(local13, arg3)) {
				this.method1875("mismatch");
				return null;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/lang/String;)Z")
	private boolean method1874(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(15) FileOutputStream local15 = new FileOutputStream(arg1);
			local15.write(arg0, 0, arg0.length);
			local15.close();
			return true;
		} catch (@Pc(26) IOException local26) {
			this.method1875("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method1875(@OriginalArg(1) String arg0) {
		if (this.aBoolean151) {
			return;
		}
		this.aBoolean151 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(28) Exception local28) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt2767 = Integer.parseInt(this.getParameter("width"));
			this.anInt2766 = Integer.parseInt(this.getParameter("height"));
			@Pc(15) int local15 = 32;
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local15 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			try {
				this.aClass69_1 = new Class69(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local15, "runescape", 12);
			} catch (@Pc(42) Exception local42) {
				this.method1875("nocache");
				return;
			}
			@Pc(53) ClassLoader_Sub1 local53 = new ClassLoader_Sub1();
			@Pc(73) byte[] local73;
			try {
				Class.forName("java.util.jar.Pack200");
				local73 = this.method1873("game code", 196445, this.aClass69_1.aString12 + "main_file_cache.dat0", "runescape.pack200?crc=55039434");
				if (local73 == null) {
					return;
				}
				local53.aClass66_1 = new Class66_Sub1(local73);
			} catch (@Pc(84) Throwable local84) {
			}
			@Pc(118) Class local118;
			if (local53.aClass66_1 == null) {
				local73 = this.method1873("unpacker", 17829, this.aClass69_1.aString15 + "shared_game_unpacker.dat", "unpackclass.jar?crc=1734823955");
				if (local73 == null) {
					return;
				}
				local53.aClass66_1 = new Class66(local73);
				local118 = Class.forName("Class66");
				local53.aHashtable1.put(local118.getName(), local118);
				@Pc(129) Class local129 = local53.loadClass("unpackclass");
				local53 = new ClassLoader_Sub1();
				local73 = this.method1873("game code", 210295, this.aClass69_1.aString12 + "main_file_cache.dat1", "runescape.js5?crc=-1139130518");
				if (local73 == null) {
					return;
				}
				local53.aClass66_1 = (Class66) local129.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local73, Boolean.TRUE);
			}
			local118 = Class.forName("Class67");
			local53.aHashtable1.put(local118.getName(), local118);
			@Pc(194) Class local194 = Class.forName("Class69");
			local53.aHashtable1.put(local194.getName(), local194);
			local118 = Class.forName("Class68");
			local53.aHashtable1.put(local118.getName(), local118);
			local118 = Class.forName("Interface6");
			local53.aHashtable1.put(local118.getName(), local118);
			local118 = Class.forName("Interface5");
			local53.aHashtable1.put(local118.getName(), local118);
			local118 = local53.loadClass("client");
			this.anApplet2 = (Applet) local118.getDeclaredConstructor().newInstance();
			local118.getMethod("providesignlink", local194).invoke(null, this.aClass69_1);
			this.anApplet2.init();
			this.anApplet2.start();
		} catch (@Pc(267) Exception local267) {
			RuntimeException_Sub2.anInt2765 = -1139130518;
			if (local267 instanceof InvocationTargetException) {
				@Pc(276) Throwable local276 = ((InvocationTargetException) local267).getTargetException();
				if (local276 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method1865(local276, this, local267.toString());
			} else {
				RuntimeException_Sub2.method1865(local267, this, null);
			}
			this.method1875("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Z)[B")
	private byte[] method1876(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(15) byte[] local15 = new byte[arg0];
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(30) InputStream local30;
			if (arg3) {
				@Pc(41) Socket local41 = new Socket(InetAddress.getByName(this.getCodeBase().getHost()), 443);
				local41.setSoTimeout(10000);
				@Pc(47) OutputStream local47 = local41.getOutputStream();
				local47.write(17);
				local47.write(("JAGGRAB /" + arg2 + "\n\n").getBytes());
				local30 = local41.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(74) int local74 = 0;
			@Pc(76) int local76 = -1;
			while (local74 < local15.length) {
				@Pc(90) int local90 = local15.length - local74;
				if (local90 > 1000) {
					local90 = 1000;
				}
				@Pc(103) int local103 = local30.read(local15, local74, local90);
				if (local103 < 0) {
					throw new EOFException();
				}
				local74 += local103;
				@Pc(123) int local123 = local74 * 100 / local15.length;
				if (local76 != local123) {
					try {
						@Pc(129) Graphics local129 = this.getGraphics();
						if (local129 == null) {
							this.repaint();
						} else {
							local129.setColor(Color.black);
							local76 = local123;
							local129.fillRect(0, 0, this.anInt2767, this.anInt2766);
							@Pc(164) String local164 = "Loading " + arg1 + " - " + local123 + "%";
							local129.setColor(local20);
							local129.drawRect(this.anInt2767 / 2 - 152, this.anInt2766 / 2 + -18, 303, 33);
							local129.setFont(local8);
							local129.setColor(Color.white);
							local129.drawString(local164, (this.anInt2767 - local12.stringWidth(local164)) / 2, this.anInt2766 / 2 + 4);
						}
					} catch (@Pc(209) Exception local209) {
					}
				}
			}
			local30.close();
		} catch (@Pc(215) IOException local215) {
			return null;
		}
		return this.method1877(local15, arg2) ? local15 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "([BILjava/lang/String;)Z")
	private boolean method1877(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(14) MessageDigest local14 = MessageDigest.getInstance("SHA");
			local14.reset();
			local14.update(arg0);
			@Pc(22) byte[] local22 = local14.digest();
			if (arg1 == "runescape.pack200?crc=55039434") {
				if (local22[0] != 106 || local22[1] != -97 || local22[2] != -32 || local22[3] != -28 || local22[4] != 32 || local22[5] != -99 || local22[6] != 19 || local22[7] != 77 || local22[8] != -99 || local22[9] != 86 || local22[10] != 0 || local22[11] != -105 || local22[12] != 77 || local22[13] != 89 || local22[14] != 96 || local22[15] != 59 || local22[16] != 124 || local22[17] != 22 || local22[18] != -4 || local22[19] != 74) {
					return false;
				}
			} else if (arg1 == "runescape.js5?crc=-1139130518") {
				if (local22[0] != 61 || local22[1] != -17 || local22[2] != 86 || local22[3] != -96 || local22[4] != -32 || local22[5] != 51 || local22[6] != -101 || local22[7] != 96 || local22[8] != -52 || local22[9] != 29 || local22[10] != -82 || local22[11] != -100 || local22[12] != -127 || local22[13] != 65 || local22[14] != 84 || local22[15] != 25 || local22[16] != -104 || local22[17] != -73 || local22[18] != 91 || local22[19] != 41) {
					return false;
				}
			} else if (local22[0] != 31 || local22[1] != 17 || local22[2] != -1 || local22[3] != -10 || local22[4] != -32 || local22[5] != -13 || local22[6] != -50 || local22[7] != 82 || local22[8] != 69 || local22[9] != -65 || local22[10] != 18 || local22[11] != -120 || local22[12] != -27 || local22[13] != -13 || local22[14] != -56 || local22[15] != -126 || local22[16] != -39 || local22[17] != 24 || local22[18] != 25 || local22[19] != -119) {
				return false;
			}
			return true;
		} catch (@Pc(402) Exception local402) {
			this.method1875("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method1878(@OriginalArg(1) String arg0) {
		try {
			@Pc(4) File local4 = new File(arg0);
			if (!local4.exists()) {
				return null;
			}
			@Pc(23) int local23 = (int) local4.length();
			@Pc(34) DataInputStream local34 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(37) byte[] local37 = new byte[local23];
			local34.readFully(local37, 0, local23);
			local34.close();
			return local37;
		} catch (@Pc(47) IOException local47) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}
}
