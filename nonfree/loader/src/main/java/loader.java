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

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt4501;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt4502;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z[BLjava/io/File;)Z")
	private boolean method3562(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(24) IOException local24) {
			this.method3563("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean224 = true;
		this.aBoolean221 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method3563(@OriginalArg(1) String arg0) {
		if (this.aBoolean223) {
			return;
		}
		this.aBoolean223 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!pc;ILloader!e;)[B")
	private byte[] method3564(@OriginalArg(0) Class132 arg0, @OriginalArg(2) Class130 arg1) {
		@Pc(7) File local7 = new File(arg0.aFile5, arg1.aString12);
		@Pc(17) byte[] local17 = this.method3567(local7);
		if (!this.method3565(arg1, local17)) {
			local17 = this.method3566(false, arg1);
			if (local17 == null) {
				local17 = this.method3566(true, arg1);
			}
			if (local17 == null) {
				this.method3563("download");
				return null;
			}
			if (!this.method3562(local17, local7)) {
				return null;
			}
			local17 = this.method3567(local7);
			if (!this.method3565(arg1, local17)) {
				this.method3563("mismatch");
				return null;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean222 = true;
		this.aBoolean221 = this.aBoolean224 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt4501 = Integer.parseInt(this.getParameter("width"));
			this.anInt4502 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local1 += local18;
			} catch (@Pc(24) Exception local24) {
			}
			try {
				@Pc(28) String local28 = this.getParameter("lang");
				if (local28 != null && local28.equals("1")) {
					this.aBoolean220 = true;
				}
			} catch (@Pc(41) Exception local41) {
			}
			@Pc(50) Class132 local50;
			try {
				local50 = new Class132(true, this, local1, "runescape", 27);
			} catch (@Pc(52) Exception local52) {
				this.method3563("nocache");
				return;
			}
			@Pc(61) ClassLoader_Sub1 local61 = new ClassLoader_Sub1();
			@Pc(70) byte[] local70;
			try {
				Class.forName("java.util.jar.Pack200");
				local70 = this.method3564(local50, Class129.aClass130_2);
				if (local70 == null) {
					return;
				}
				local61.anUnpack1 = new unpack_Sub1(local70);
			} catch (@Pc(82) Throwable local82) {
			}
			if (local61.anUnpack1 == null) {
				local70 = this.method3564(local50, Class129.aClass130_1);
				if (local70 == null) {
					return;
				}
				@Pc(100) ClassLoader_Sub1 local100 = new ClassLoader_Sub1();
				local100.anUnpack1 = new unpack(local70);
				@Pc(109) Class local109 = Class.forName("unpack");
				local100.aHashtable1.put(local109.getName(), local109);
				@Pc(120) Class local120 = local100.loadClass("unpackclass");
				@Pc(126) byte[] local126 = this.method3564(local50, Class129.aClass130_3);
				if (local126 == null) {
					return;
				}
				local61.anUnpack1 = (unpack) local120.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local126, Boolean.TRUE);
			}
			@Pc(160) String local160 = System.getProperty("os.name").toLowerCase();
			if (local160.startsWith("win")) {
				this.method3564(local50, Class129.aClass130_4);
			}
			@Pc(173) Class local173 = Class.forName("Class131");
			local61.aHashtable1.put(local173.getName(), local173);
			@Pc(183) Class local183 = Class.forName("Class132");
			local61.aHashtable1.put(local183.getName(), local183);
			@Pc(193) Class local193 = Class.forName("Class133");
			local61.aHashtable1.put(local193.getName(), local193);
			@Pc(203) Class local203 = Class.forName("Interface5");
			local61.aHashtable1.put(local203.getName(), local203);
			@Pc(214) Class local214 = local61.loadClass("client");
			synchronized (this) {
				if (this.aBoolean222) {
					return;
				}
				this.anApplet2 = (Applet) local214.getDeclaredConstructor().newInstance();
				local214.getMethod("providesignlink", local183).invoke(null, local50);
				this.anApplet2.init();
				if (this.aBoolean221) {
					this.anApplet2.start();
				}
				if (this.aBoolean224) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(272) Exception local272) {
			RuntimeException_Sub2.anInt4497 = -2019958745;
			if (local272 instanceof InvocationTargetException) {
				@Pc(281) Throwable local281 = ((InvocationTargetException) local272).getTargetException();
				if (local281 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3548(local272.toString(), local281, this);
			} else {
				RuntimeException_Sub2.method3548(null, local272, this);
			}
			this.method3563("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;[BB)Z")
	private boolean method3565(@OriginalArg(0) Class130 arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(17) MessageDigest local17 = MessageDigest.getInstance("SHA");
			local17.reset();
			local17.update(arg1);
			@Pc(25) byte[] local25 = local17.digest();
			for (@Pc(27) int local27 = 0; local27 < 20; local27++) {
				if (arg0.anIntArray522[local27] != local25[local27]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method3563("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!e;)[B")
	private byte[] method3566(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class130 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(21) byte[] local21 = new byte[arg1.anInt4500];
		try {
			@Pc(43) InputStream local43;
			if (arg0) {
				@Pc(48) URL local48 = this.getCodeBase();
				@Pc(56) Socket local56 = new Socket(InetAddress.getByName(local48.getHost()), 443);
				local56.setSoTimeout(10000);
				@Pc(62) OutputStream local62 = local56.getOutputStream();
				local62.write(17);
				local62.write(("JAGGRAB " + local48.getFile() + arg1.aString13 + "\n\n").getBytes());
				local43 = local56.getInputStream();
			} else {
				local43 = (new URL(this.getCodeBase(), arg1.aString13)).openStream();
			}
			@Pc(87) int local87 = -1;
			@Pc(89) int local89 = 0;
			while (local21.length > local89) {
				@Pc(103) int local103 = local21.length - local89;
				if (local103 > 1000) {
					local103 = 1000;
				}
				@Pc(117) int local117 = local43.read(local21, local89, local103);
				if (local117 < 0) {
					throw new EOFException();
				}
				local89 += local117;
				@Pc(136) int local136 = local89 * 100 / local21.length;
				if (local136 != local87) {
					try {
						@Pc(143) Graphics local143 = this.getGraphics();
						if (local143 == null) {
							this.repaint();
						} else {
							local143.setColor(Color.black);
							local143.fillRect(0, 0, this.anInt4501, this.anInt4502);
							local87 = local136;
							local143.setColor(local17);
							local143.drawRect(this.anInt4501 / 2 - 152, this.anInt4502 / 2 + -18, 303, 33);
							@Pc(197) String local197 = this.aBoolean220 ? arg1.aString14 : arg1.aString15 + " - " + local136 + "%";
							local143.setFont(local8);
							local143.setColor(Color.white);
							local143.drawString(local197, (this.anInt4501 - local12.stringWidth(local197)) / 2, this.anInt4502 / 2 + 4);
						}
					} catch (@Pc(227) Exception local227) {
					}
				}
			}
			local43.close();
			if (arg1.anInt4499 != arg1.anInt4500) {
				@Pc(241) byte[] local241 = new byte[arg1.anInt4499];
				@Pc(246) Inflater local246 = new Inflater(true);
				local246.setInput(local21);
				local21 = local241;
				local246.inflate(local241);
			}
		} catch (@Pc(257) Exception local257) {
			return null;
		}
		return this.method3565(arg1, local21) ? local21 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean222 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method3567(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local9];
			local20.readFully(local28, 0, local9);
			local20.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean224 = false;
		this.aBoolean221 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}
}
