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
	private int anInt2960;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt2961;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Lloader!cc;")
	private Class67 aClass67_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean141;

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(3) int local3 = 32;
			this.anInt2961 = Integer.parseInt(this.getParameter("width"));
			this.anInt2960 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local3 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			try {
				this.aClass67_1 = new Class67(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local3, "runescape", 12);
			} catch (@Pc(42) Exception local42) {
				this.method2105("nocache");
				return;
			}
			@Pc(53) ClassLoader_Sub1 local53 = new ClassLoader_Sub1();
			@Pc(73) byte[] local73;
			try {
				Class.forName("java.util.jar.Pack200");
				local73 = this.method2102("game code", 197296, "runescape.pack200?crc=1701399475", this.aClass67_1.aString15 + "main_file_cache.dat0");
				if (local73 == null) {
					return;
				}
				local53.aClass66_1 = new Class66_Sub1(local73);
			} catch (@Pc(84) Throwable local84) {
			}
			@Pc(118) Class local118;
			if (local53.aClass66_1 == null) {
				local73 = this.method2102("unpacker", 17829, "unpackclass.jar?crc=1734823955", this.aClass67_1.aString16 + "shared_game_unpacker.dat");
				if (local73 == null) {
					return;
				}
				local53.aClass66_1 = new Class66(local73);
				local118 = Class.forName("Class66");
				local53.aHashtable1.put(local118.getName(), local118);
				@Pc(129) Class local129 = local53.loadClass("unpackclass");
				local53 = new ClassLoader_Sub1();
				local73 = this.method2102("game code", 209734, "runescape.js5?crc=-281034984", this.aClass67_1.aString15 + "main_file_cache.dat1");
				if (local73 == null) {
					return;
				}
				local53.aClass66_1 = (Class66) local129.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local73, Boolean.TRUE);
			}
			local118 = Class.forName("Class69");
			local53.aHashtable1.put(local118.getName(), local118);
			@Pc(195) Class local195 = Class.forName("Class67");
			local53.aHashtable1.put(local195.getName(), local195);
			local118 = Class.forName("Class68");
			local53.aHashtable1.put(local118.getName(), local118);
			local118 = Class.forName("Interface6");
			local53.aHashtable1.put(local118.getName(), local118);
			local118 = Class.forName("Interface5");
			local53.aHashtable1.put(local118.getName(), local118);
			local118 = local53.loadClass("client");
			this.anApplet3 = (Applet) local118.getDeclaredConstructor().newInstance();
			local118.getMethod("providesignlink", local195).invoke(null, this.aClass67_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(268) Exception local268) {
			RuntimeException_Sub2.anInt2953 = -281034984;
			if (local268 instanceof InvocationTargetException) {
				@Pc(277) Throwable local277 = ((InvocationTargetException) local268).getTargetException();
				if (local277 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2083(local268.toString(), local277, this);
			} else {
				RuntimeException_Sub2.method2083(null, local268, this);
			}
			this.method2105("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;[BB)Z")
	private boolean method2101(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg1);
			@Pc(18) byte[] local18 = local10.digest();
			if (arg0 == "runescape.pack200?crc=1701399475") {
				if (local18[0] != -124 || local18[1] != -55 || local18[2] != -128 || local18[3] != -57 || local18[4] != -2 || local18[5] != -101 || local18[6] != 30 || local18[7] != -24 || local18[8] != -103 || local18[9] != -94 || local18[10] != -20 || local18[11] != 69 || local18[12] != -86 || local18[13] != -62 || local18[14] != 99 || local18[15] != -95 || local18[16] != 107 || local18[17] != -69 || local18[18] != 55 || local18[19] != -104) {
					return false;
				}
			} else if (arg0 == "runescape.js5?crc=-281034984") {
				if (local18[0] != 45 || local18[1] != 8 || local18[2] != -104 || local18[3] != 127 || local18[4] != -17 || local18[5] != -79 || local18[6] != -40 || local18[7] != -41 || local18[8] != 41 || local18[9] != -12 || local18[10] != 36 || local18[11] != 108 || local18[12] != -38 || local18[13] != 44 || local18[14] != -50 || local18[15] != -110 || local18[16] != 78 || local18[17] != 17 || local18[18] != 86 || local18[19] != 39) {
					return false;
				}
			} else if (local18[0] != 31 || local18[1] != 17 || local18[2] != -1 || local18[3] != -10 || local18[4] != -32 || local18[5] != -13 || local18[6] != -50 || local18[7] != 82 || local18[8] != 69 || local18[9] != -65 || local18[10] != 18 || local18[11] != -120 || local18[12] != -27 || local18[13] != -13 || local18[14] != -56 || local18[15] != -126 || local18[16] != -39 || local18[17] != 24 || local18[18] != 25 || local18[19] != -119) {
				return false;
			}
			return true;
		} catch (@Pc(411) Exception local411) {
			this.method2105("sha");
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

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)[B")
	private byte[] method2102(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		@Pc(14) byte[] local14 = this.method2104(arg3);
		if (!this.method2101(arg2, local14)) {
			local14 = this.method2106(arg2, arg1, arg0, false);
			if (local14 == null) {
				local14 = this.method2106(arg2, arg1, arg0, true);
			}
			if (local14 == null) {
				this.method2105("download");
				return null;
			}
			if (!this.method2103(arg3, local14)) {
				return null;
			}
			local14 = this.method2104(arg3);
			if (!this.method2101(arg2, local14)) {
				this.method2105("mismatch");
				return null;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z[B)Z")
	private boolean method2103(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(8) FileOutputStream local8 = new FileOutputStream(arg0);
			local8.write(arg1, 0, arg1.length);
			local8.close();
			return true;
		} catch (@Pc(19) IOException local19) {
			this.method2105("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method2104(@OriginalArg(0) String arg0) {
		try {
			@Pc(4) File local4 = new File(arg0);
			if (!local4.exists()) {
				return null;
			}
			@Pc(15) int local15 = (int) local4.length();
			@Pc(37) DataInputStream local37 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(40) byte[] local40 = new byte[local15];
			local37.readFully(local40, 0, local15);
			local37.close();
			return local40;
		} catch (@Pc(50) IOException local50) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method2105(@OriginalArg(1) String arg0) {
		if (this.aBoolean141) {
			return;
		}
		this.aBoolean141 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Z)[B")
	private byte[] method2106(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg1];
		try {
			@Pc(67) InputStream local67;
			if (arg3) {
				@Pc(42) Socket local42 = new Socket(InetAddress.getByName(this.getCodeBase().getHost()), 443);
				local42.setSoTimeout(10000);
				@Pc(48) OutputStream local48 = local42.getOutputStream();
				local48.write(17);
				local48.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
				local67 = local42.getInputStream();
			} else {
				local67 = (new URL(this.getCodeBase(), arg0)).openStream();
			}
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = 0;
			while (local20.length > local81) {
				@Pc(90) int local90 = local20.length - local81;
				if (local90 > 1000) {
					local90 = 1000;
				}
				@Pc(103) int local103 = local67.read(local20, local81, local90);
				if (local103 < 0) {
					throw new EOFException();
				}
				local81 += local103;
				@Pc(125) int local125 = local81 * 100 / local20.length;
				if (local79 != local125) {
					try {
						@Pc(131) Graphics local131 = this.getGraphics();
						if (local131 == null) {
							this.repaint();
						} else {
							local131.setColor(Color.black);
							local131.fillRect(0, 0, this.anInt2961, this.anInt2960);
							local79 = local125;
							@Pc(161) String local161 = "Loading " + arg2 + " - " + local125 + "%";
							local131.setColor(local17);
							local131.drawRect(this.anInt2961 / 2 - 152, this.anInt2960 / 2 + -18, 303, 33);
							local131.setFont(local8);
							local131.setColor(Color.white);
							local131.drawString(local161, (this.anInt2961 - local12.stringWidth(local161)) / 2, this.anInt2960 / 2 + 4);
						}
					} catch (@Pc(210) Exception local210) {
					}
				}
			}
			local67.close();
		} catch (@Pc(216) IOException local216) {
			return null;
		}
		return this.method2101(arg0, local20) ? local20 : null;
	}
}
