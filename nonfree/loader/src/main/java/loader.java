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
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!loader")
public final class loader extends Applet implements Runnable {

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt4930;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt4931;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean216 = true;
		this.aBoolean218 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean218 = true;
		this.aBoolean216 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!lj;BLloader!a;)[B")
	private byte[] method4022(@OriginalArg(0) Class119 arg0, @OriginalArg(2) Class115 arg1) {
		@Pc(7) File local7 = new File(arg0.aFile6, arg1.aString11);
		@Pc(12) byte[] local12 = this.method4023(local7);
		if (!this.method4025(arg1, local12)) {
			local12 = this.method4024(false, arg1);
			if (local12 == null) {
				local12 = this.method4024(true, arg1);
			}
			if (local12 == null) {
				this.method4026("download");
				return null;
			}
			if (!this.method4027(local12, local7)) {
				return null;
			}
			local12 = this.method4023(local7);
			if (!this.method4025(arg1, local12)) {
				this.method4026("mismatch");
				return null;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method4023(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(14) int local14 = (int) arg0.length();
			@Pc(25) DataInputStream local25 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local14];
			local25.readFully(local28, 0, local14);
			local25.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean218 = this.aBoolean216 = false;
		this.aBoolean219 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!a;I)[B")
	private byte[] method4024(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class115 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(23) Color local23 = new Color(9179409);
		@Pc(27) byte[] local27 = new byte[arg1.anInt4923];
		try {
			@Pc(69) InputStream local69;
			if (arg0) {
				@Pc(32) URL local32 = this.getCodeBase();
				@Pc(40) Socket local40 = new Socket(InetAddress.getByName(local32.getHost()), 443);
				local40.setSoTimeout(10000);
				@Pc(46) OutputStream local46 = local40.getOutputStream();
				local46.write(17);
				local46.write(("JAGGRAB " + local32.getFile() + arg1.aString9 + "\n\n").getBytes());
				local69 = local40.getInputStream();
			} else {
				local69 = (new URL(this.getCodeBase(), arg1.aString9)).openStream();
			}
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = 0;
			while (local27.length > local84) {
				@Pc(94) int local94 = local27.length - local84;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(106) int local106 = local69.read(local27, local84, local94);
				if (local106 < 0) {
					throw new EOFException();
				}
				local84 += local106;
				@Pc(124) int local124 = local84 * 100 / local27.length;
				if (local82 != local124) {
					try {
						@Pc(135) Graphics local135 = this.getGraphics();
						if (local135 == null) {
							this.repaint();
						} else {
							local82 = local124;
							local135.setColor(Color.black);
							local135.fillRect(0, 0, this.anInt4931, this.anInt4930);
							local135.setColor(local23);
							local135.drawRect(this.anInt4931 / 2 - 152, this.anInt4930 / 2 + -18, 303, 33);
							@Pc(193) String local193 = this.aBoolean217 ? arg1.aString8 : arg1.aString10 + " - " + local124 + "%";
							local135.setFont(local8);
							local135.setColor(Color.white);
							local135.drawString(local193, (this.anInt4931 - local12.stringWidth(local193)) / 2, this.anInt4930 / 2 + 4);
						}
					} catch (@Pc(219) Exception local219) {
					}
				}
			}
			local69.close();
			if (arg1.anInt4923 != arg1.anInt4922) {
				@Pc(233) byte[] local233 = new byte[arg1.anInt4922];
				@Pc(238) Inflater local238 = new Inflater(true);
				local238.setInput(local27);
				local27 = local233;
				local238.inflate(local233);
			}
		} catch (@Pc(249) Exception local249) {
			return null;
		}
		return this.method4025(arg1, local27) ? local27 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!a;[BI)Z")
	private boolean method4025(@OriginalArg(0) Class115 arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (local17[local25] != arg0.anIntArray798[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(43) Exception local43) {
			this.method4026("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4931 = Integer.parseInt(this.getParameter("width"));
			this.anInt4930 = Integer.parseInt(this.getParameter("height"));
			@Pc(13) int local13 = 32;
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local13 += local18;
			} catch (@Pc(24) Exception local24) {
			}
			try {
				@Pc(28) String local28 = this.getParameter("lang");
				if (local28 != null && local28.equals("1")) {
					this.aBoolean217 = true;
				}
			} catch (@Pc(41) Exception local41) {
			}
			@Pc(50) Class119 local50;
			try {
				local50 = new Class119(true, this, local13, "runescape", 27);
			} catch (@Pc(52) Exception local52) {
				this.method4026("nocache");
				return;
			}
			@Pc(61) ClassLoader_Sub1 local61 = new ClassLoader_Sub1();
			@Pc(70) byte[] local70;
			try {
				Class.forName("java.util.jar.Pack200");
				local70 = this.method4022(local50, Class116.aClass115_2);
				if (local70 == null) {
					return;
				}
				local61.anUnpack1 = new unpack_Sub1(local70);
			} catch (@Pc(82) Throwable local82) {
			}
			if (local61.anUnpack1 == null) {
				local70 = this.method4022(local50, Class116.aClass115_1);
				if (local70 == null) {
					return;
				}
				@Pc(100) ClassLoader_Sub1 local100 = new ClassLoader_Sub1();
				local100.anUnpack1 = new unpack(local70);
				@Pc(109) Class local109 = Class.forName("unpack");
				local100.aHashtable1.put(local109.getName(), local109);
				@Pc(120) Class local120 = local100.loadClass("unpackclass");
				@Pc(126) byte[] local126 = this.method4022(local50, Class116.aClass115_3);
				if (local126 == null) {
					return;
				}
				local61.anUnpack1 = (unpack) local120.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local126, Boolean.TRUE);
			}
			@Pc(159) Class local159 = Class.forName("Class118");
			local61.aHashtable1.put(local159.getName(), local159);
			@Pc(169) Class local169 = Class.forName("Class119");
			local61.aHashtable1.put(local169.getName(), local169);
			@Pc(179) Class local179 = Class.forName("Class117");
			local61.aHashtable1.put(local179.getName(), local179);
			@Pc(189) Class local189 = Class.forName("Interface5");
			local61.aHashtable1.put(local189.getName(), local189);
			@Pc(200) Class local200 = local61.loadClass("client");
			synchronized (this) {
				if (this.aBoolean219) {
					return;
				}
				this.anApplet3 = (Applet) local200.getDeclaredConstructor().newInstance();
				local200.getMethod("providesignlink", local169).invoke(null, local50);
				this.anApplet3.init();
				if (this.aBoolean218) {
					this.anApplet3.start();
				}
				if (this.aBoolean216) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(261) Exception local261) {
			RuntimeException_Sub2.anInt4924 = 502934203;
			if (local261 instanceof InvocationTargetException) {
				@Pc(277) Throwable local277 = ((InvocationTargetException) local261).getTargetException();
				if (local277 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3993(local261.toString(), this, local277);
			} else {
				RuntimeException_Sub2.method3993(null, this, local261);
			}
			this.method4026("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method4026(@OriginalArg(0) String arg0) {
		if (this.aBoolean220) {
			return;
		}
		this.aBoolean220 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
		} catch (@Pc(28) Exception local28) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean219 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/io/File;)Z")
	private boolean method4027(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method4026("savefile");
			return false;
		}
	}
}
