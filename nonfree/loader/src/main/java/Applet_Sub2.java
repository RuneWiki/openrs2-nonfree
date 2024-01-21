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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!fb;")
	private Class70 aClass70_1;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt3290;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt3291;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean170;

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/lang/String;)Z")
	private boolean method2136(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg0);
			@Pc(23) byte[] local23 = local10.digest();
			if (arg1 == "runescape.pack200?crc=1077673506") {
				if (local23[0] != -120 || local23[1] != -126 || local23[2] != -81 || local23[3] != -125 || local23[4] != 32 || local23[5] != -60 || local23[6] != 66 || local23[7] != -67 || local23[8] != 29 || local23[9] != 94 || local23[10] != -94 || local23[11] != -4 || local23[12] != 107 || local23[13] != 117 || local23[14] != -32 || local23[15] != -34 || local23[16] != -42 || local23[17] != 78 || local23[18] != -120 || local23[19] != 18) {
					return false;
				}
			} else if (arg1 == "runescape.js5?crc=-1056306816") {
				if (local23[0] != 45 || local23[1] != -44 || local23[2] != -37 || local23[3] != -127 || local23[4] != -42 || local23[5] != 29 || local23[6] != -38 || local23[7] != 87 || local23[8] != 79 || local23[9] != -61 || local23[10] != -110 || local23[11] != -39 || local23[12] != -50 || local23[13] != 123 || local23[14] != -32 || local23[15] != -86 || local23[16] != 72 || local23[17] != -4 || local23[18] != 56 || local23[19] != 98) {
					return false;
				}
			} else if (local23[0] != 3 || local23[1] != -21 || local23[2] != 65 || local23[3] != -60 || local23[4] != -33 || local23[5] != -24 || local23[6] != 92 || local23[7] != 4 || local23[8] != -2 || local23[9] != 48 || local23[10] != 106 || local23[11] != 50 || local23[12] != -46 || local23[13] != -31 || local23[14] != -44 || local23[15] != 120 || local23[16] != -104 || local23[17] != 72 || local23[18] != 50 || local23[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(413) Exception local413) {
			this.method2140("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)[B")
	private byte[] method2137(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(12) byte[] local12 = this.method2141(arg3);
		if (!this.method2136(local12, arg1)) {
			local12 = this.method2139(false, arg1, arg0, arg2);
			if (local12 == null) {
				local12 = this.method2139(true, arg1, arg0, arg2);
			}
			if (local12 == null) {
				this.method2140("download");
				return null;
			}
			if (!this.method2138(local12, arg3)) {
				return null;
			}
			local12 = this.method2141(arg3);
			if (!this.method2136(local12, arg1)) {
				this.method2140("mismatch");
				return null;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/lang/String;)Z")
	private boolean method2138(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(11) FileOutputStream local11 = new FileOutputStream(arg1);
			local11.write(arg0, 0, arg0.length);
			local11.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method2140("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;BI)[B")
	private byte[] method2139(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(15) byte[] local15 = new byte[arg3];
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(30) InputStream local30;
			if (arg0) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg1 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(73) int local73 = -1;
			@Pc(75) int local75 = 0;
			while (local15.length > local75) {
				@Pc(89) int local89 = local15.length - local75;
				if (local89 > 1000) {
					local89 = 1000;
				}
				@Pc(100) int local100 = local30.read(local15, local75, local89);
				if (local100 < 0) {
					throw new EOFException();
				}
				local75 += local100;
				@Pc(118) int local118 = local75 * 100 / local15.length;
				if (local118 != local73) {
					try {
						@Pc(128) Graphics local128 = this.getGraphics();
						if (local128 == null) {
							this.repaint();
						} else {
							local73 = local118;
							local128.setColor(Color.black);
							@Pc(155) String local155 = "Loading " + arg2 + " - " + local118 + "%";
							local128.fillRect(0, 0, this.anInt3291, this.anInt3290);
							local128.setColor(local20);
							local128.drawRect(this.anInt3291 / 2 - 152, this.anInt3290 / 2 + -18, 303, 33);
							local128.setFont(local8);
							local128.setColor(Color.white);
							local128.drawString(local155, (this.anInt3291 - local12.stringWidth(local155)) / 2, this.anInt3290 / 2 + 4);
						}
					} catch (@Pc(208) Exception local208) {
					}
				}
			}
			local30.close();
		} catch (@Pc(222) IOException local222) {
			return null;
		}
		return this.method2136(local15, arg1) ? local15 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2140(@OriginalArg(1) String arg0) {
		if (this.aBoolean170) {
			return;
		}
		this.aBoolean170 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)[B")
	private byte[] method2141(@OriginalArg(1) String arg0) {
		try {
			@Pc(4) File local4 = new File(arg0);
			if (!local4.exists()) {
				return null;
			}
			@Pc(13) int local13 = (int) local4.length();
			@Pc(24) DataInputStream local24 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(27) byte[] local27 = new byte[local13];
			local24.readFully(local27, 0, local13);
			local24.close();
			return local27;
		} catch (@Pc(42) IOException local42) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3291 = Integer.parseInt(this.getParameter("width"));
			@Pc(9) int local9 = 32;
			this.anInt3290 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local9 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			try {
				this.aClass70_1 = new Class70(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local9, "runescape", 13);
			} catch (@Pc(42) Exception local42) {
				this.method2140("nocache");
				return;
			}
			@Pc(51) ClassLoader_Sub1 local51 = new ClassLoader_Sub1();
			@Pc(73) byte[] local73;
			try {
				Class.forName("java.util.jar.Pack200");
				local73 = this.method2137("game code", "runescape.pack200?crc=1077673506", 210197, this.aClass70_1.aString10 + "main_file_cache.dat0");
				if (local73 == null) {
					return;
				}
				local51.aClass69_1 = new Class69_Sub1(local73);
			} catch (@Pc(84) Throwable local84) {
			}
			@Pc(119) Class local119;
			if (local51.aClass69_1 == null) {
				local73 = this.method2137("unpacker", "unpackclass.jar?crc=-549807395", 17836, this.aClass70_1.aString15 + "shared_game_unpacker.dat");
				if (local73 == null) {
					return;
				}
				local51.aClass69_1 = new Class69(local73);
				local119 = Class.forName("Class69");
				local51.aHashtable1.put(local119.getName(), local119);
				@Pc(130) Class local130 = local51.loadClass("unpackclass");
				local51 = new ClassLoader_Sub1();
				local73 = this.method2137("game code", "runescape.js5?crc=-1056306816", 226767, this.aClass70_1.aString10 + "main_file_cache.dat1");
				if (local73 == null) {
					return;
				}
				local51.aClass69_1 = (Class69) local130.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local73, Boolean.TRUE);
			}
			local119 = Class.forName("Class72");
			local51.aHashtable1.put(local119.getName(), local119);
			@Pc(195) Class local195 = Class.forName("Class70");
			local51.aHashtable1.put(local195.getName(), local195);
			local119 = Class.forName("Class71");
			local51.aHashtable1.put(local119.getName(), local119);
			local119 = Class.forName("Interface6");
			local51.aHashtable1.put(local119.getName(), local119);
			local119 = Class.forName("Interface5");
			local51.aHashtable1.put(local119.getName(), local119);
			local119 = local51.loadClass("client");
			this.anApplet3 = (Applet) local119.getDeclaredConstructor().newInstance();
			local119.getMethod("providesignlink", local195).invoke(null, this.aClass70_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(268) Exception local268) {
			RuntimeException_Sub2.anInt3283 = -1056306816;
			if (local268 instanceof InvocationTargetException) {
				@Pc(284) Throwable local284 = ((InvocationTargetException) local268).getTargetException();
				if (local284 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2108(local284, local268.toString(), this);
			} else {
				RuntimeException_Sub2.method2108(local268, null, this);
			}
			this.method2140("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}
}
