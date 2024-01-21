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
	private int anInt2869;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!aa;")
	private Class69 aClass69_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt2870;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean256;

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)[B")
	private byte[] method1961(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(6) byte[] local6 = this.method1962(arg1);
		if (!this.method1963(local6, arg3)) {
			local6 = this.method1965(false, arg0, arg2, arg3);
			if (local6 == null) {
				local6 = this.method1965(true, arg0, arg2, arg3);
			}
			if (local6 == null) {
				this.method1966("download");
				return null;
			}
			if (!this.method1964(local6, arg1)) {
				return null;
			}
			local6 = this.method1962(arg1);
			if (!this.method1963(local6, arg3)) {
				this.method1966("mismatch");
				return null;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method1962(@OriginalArg(0) String arg0) {
		try {
			@Pc(4) File local4 = new File(arg0);
			if (!local4.exists()) {
				return null;
			}
			@Pc(21) int local21 = (int) local4.length();
			@Pc(24) byte[] local24 = new byte[local21];
			@Pc(35) DataInputStream local35 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local35.readFully(local24, 0, local21);
			local35.close();
			return local24;
		} catch (@Pc(45) IOException local45) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;I)Z")
	private boolean method1963(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg0);
			@Pc(18) byte[] local18 = local10.digest();
			if (arg1 == "runescape.pack200?crc=-458298714") {
				if (local18[0] != -69 || local18[1] != 117 || local18[2] != 111 || local18[3] != -76 || local18[4] != 76 || local18[5] != 84 || local18[6] != -38 || local18[7] != 105 || local18[8] != -103 || local18[9] != -101 || local18[10] != 13 || local18[11] != 125 || local18[12] != -93 || local18[13] != 87 || local18[14] != 93 || local18[15] != -43 || local18[16] != 59 || local18[17] != 13 || local18[18] != 92 || local18[19] != -65) {
					return false;
				}
			} else if (arg1 == "runescape.js5?crc=52600222") {
				if (local18[0] != -58 || local18[1] != 3 || local18[2] != 67 || local18[3] != -98 || local18[4] != 70 || local18[5] != -14 || local18[6] != -64 || local18[7] != -101 || local18[8] != -31 || local18[9] != -78 || local18[10] != 37 || local18[11] != 66 || local18[12] != -84 || local18[13] != 1 || local18[14] != 113 || local18[15] != -15 || local18[16] != 5 || local18[17] != -10 || local18[18] != 103 || local18[19] != -87) {
					return false;
				}
			} else if (local18[0] != 3 || local18[1] != -21 || local18[2] != 65 || local18[3] != -60 || local18[4] != -33 || local18[5] != -24 || local18[6] != 92 || local18[7] != 4 || local18[8] != -2 || local18[9] != 48 || local18[10] != 106 || local18[11] != 50 || local18[12] != -46 || local18[13] != -31 || local18[14] != -44 || local18[15] != 120 || local18[16] != -104 || local18[17] != 72 || local18[18] != 50 || local18[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(411) Exception local411) {
			this.method1966("sha");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/lang/String;)Z")
	private boolean method1964(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method1966("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLjava/lang/String;ILjava/lang/String;)[B")
	private byte[] method1965(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(22) byte[] local22 = new byte[arg2];
		@Pc(27) Color local27 = new Color(9179409);
		try {
			@Pc(68) InputStream local68;
			if (arg0) {
				@Pc(32) URL local32 = this.getCodeBase();
				@Pc(40) Socket local40 = new Socket(InetAddress.getByName(local32.getHost()), 443);
				local40.setSoTimeout(10000);
				@Pc(46) OutputStream local46 = local40.getOutputStream();
				local46.write(17);
				local46.write(("JAGGRAB " + local32.getFile() + arg3 + "\n\n").getBytes());
				local68 = local40.getInputStream();
			} else {
				local68 = (new URL(this.getCodeBase(), arg3)).openStream();
			}
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = 0;
			while (local82 < local22.length) {
				@Pc(92) int local92 = local22.length - local82;
				if (local92 > 1000) {
					local92 = 1000;
				}
				@Pc(105) int local105 = local68.read(local22, local82, local92);
				if (local105 < 0) {
					throw new EOFException();
				}
				local82 += local105;
				@Pc(125) int local125 = local82 * 100 / local22.length;
				if (local80 != local125) {
					try {
						@Pc(135) Graphics local135 = this.getGraphics();
						if (local135 == null) {
							this.repaint();
						} else {
							local80 = local125;
							@Pc(159) String local159 = "Loading " + arg1 + " - " + local125 + "%";
							local135.setColor(Color.black);
							local135.fillRect(0, 0, this.anInt2869, this.anInt2870);
							local135.setColor(local27);
							local135.drawRect(this.anInt2869 / 2 - 152, this.anInt2870 / 2 + -18, 303, 33);
							local135.setFont(local8);
							local135.setColor(Color.white);
							local135.drawString(local159, (this.anInt2869 - local12.stringWidth(local159)) / 2, this.anInt2870 / 2 + 4);
						}
					} catch (@Pc(215) Exception local215) {
					}
				}
			}
			local68.close();
		} catch (@Pc(221) IOException local221) {
			return null;
		}
		return this.method1963(local22, arg3) ? local22 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(Ljava/lang/String;I)V")
	private void method1966(@OriginalArg(0) String arg0) {
		if (this.aBoolean256) {
			return;
		}
		this.aBoolean256 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt2869 = Integer.parseInt(this.getParameter("width"));
			this.anInt2870 = Integer.parseInt(this.getParameter("height"));
			@Pc(15) int local15 = 32;
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local15 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			try {
				this.aClass69_1 = new Class69(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local15, "runescape", 13);
			} catch (@Pc(42) Exception local42) {
				this.method1966("nocache");
				return;
			}
			@Pc(53) ClassLoader_Sub1 local53 = new ClassLoader_Sub1();
			@Pc(73) byte[] local73;
			try {
				Class.forName("java.util.jar.Pack200");
				local73 = this.method1961("game code", this.aClass69_1.aString15 + "main_file_cache.dat0", 205586, "runescape.pack200?crc=-458298714");
				if (local73 == null) {
					return;
				}
				local53.aClass70_1 = new Class70_Sub1(local73);
			} catch (@Pc(86) Throwable local86) {
			}
			@Pc(120) Class local120;
			if (local53.aClass70_1 == null) {
				local73 = this.method1961("unpacker", this.aClass69_1.aString13 + "shared_game_unpacker.dat", 17836, "unpackclass.jar?crc=-549807395");
				if (local73 == null) {
					return;
				}
				local53.aClass70_1 = new Class70(local73);
				local120 = Class.forName("Class70");
				local53.aHashtable1.put(local120.getName(), local120);
				@Pc(131) Class local131 = local53.loadClass("unpackclass");
				local53 = new ClassLoader_Sub1();
				local73 = this.method1961("game code", this.aClass69_1.aString15 + "main_file_cache.dat1", 219483, "runescape.js5?crc=52600222");
				if (local73 == null) {
					return;
				}
				local53.aClass70_1 = (Class70) local131.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local73, Boolean.TRUE);
			}
			local120 = Class.forName("Class72");
			local53.aHashtable1.put(local120.getName(), local120);
			@Pc(195) Class local195 = Class.forName("Class69");
			local53.aHashtable1.put(local195.getName(), local195);
			local120 = Class.forName("Class71");
			local53.aHashtable1.put(local120.getName(), local120);
			local120 = Class.forName("Interface6");
			local53.aHashtable1.put(local120.getName(), local120);
			local120 = Class.forName("Interface5");
			local53.aHashtable1.put(local120.getName(), local120);
			local120 = local53.loadClass("client");
			this.anApplet3 = (Applet) local120.getDeclaredConstructor().newInstance();
			local120.getMethod("providesignlink", local195).invoke(null, this.aClass69_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(268) Exception local268) {
			RuntimeException_Sub2.anInt2865 = 52600222;
			if (local268 instanceof InvocationTargetException) {
				@Pc(284) Throwable local284 = ((InvocationTargetException) local268).getTargetException();
				if (local284 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method1949(local284, this, local268.toString());
			} else {
				RuntimeException_Sub2.method1949(local268, this, null);
			}
			this.method1966("crash");
		}
	}
}
