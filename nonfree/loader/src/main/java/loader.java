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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt4895;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt4896;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!c;Lloader!mi;I)[B")
	private byte[] method3844(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class131 arg1) {
		@Pc(7) File local7 = new File(arg1.aFile5, arg0.aString11);
		@Pc(19) byte[] local19 = this.method3845(local7);
		if (!this.method3846(arg0, local19)) {
			local19 = this.method3847(false, arg0);
			if (local19 == null) {
				local19 = this.method3847(true, arg0);
			}
			if (local19 == null) {
				this.method3848("download");
				return null;
			}
			if (!this.method3849(local7, local19)) {
				return null;
			}
			local19 = this.method3845(local7);
			if (!this.method3846(arg0, local19)) {
				this.method3848("mismatch");
				return null;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean219 = this.aBoolean220 = false;
		this.aBoolean218 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method3845(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!c;[B)Z")
	private boolean method3846(@OriginalArg(1) Class128 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (arg0.anIntArray381[local19] != local17[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(50) Exception local50) {
			this.method3848("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZBLloader!c;)[B")
	private byte[] method3847(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class128 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(21) byte[] local21 = new byte[arg1.anInt4891];
		try {
			@Pc(32) InputStream local32;
			if (arg0) {
				@Pc(37) URL local37 = this.getCodeBase();
				@Pc(45) Socket local45 = new Socket(InetAddress.getByName(local37.getHost()), 443);
				local45.setSoTimeout(10000);
				@Pc(51) OutputStream local51 = local45.getOutputStream();
				local51.write(17);
				local51.write(("JAGGRAB " + local37.getFile() + arg1.aString9 + "\n\n").getBytes());
				local32 = local45.getInputStream();
			} else {
				local32 = (new URL(this.getCodeBase(), arg1.aString9)).openStream();
			}
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = 0;
			while (local78 < local21.length) {
				@Pc(88) int local88 = local21.length - local78;
				if (local88 > 1000) {
					local88 = 1000;
				}
				@Pc(99) int local99 = local32.read(local21, local78, local88);
				if (local99 < 0) {
					throw new EOFException();
				}
				local78 += local99;
				@Pc(119) int local119 = local78 * 100 / local21.length;
				if (local76 != local119) {
					try {
						@Pc(126) Graphics local126 = this.getGraphics();
						if (local126 == null) {
							this.repaint();
						} else {
							local126.setColor(Color.black);
							local126.fillRect(0, 0, this.anInt4896, this.anInt4895);
							local76 = local119;
							local126.setColor(local17);
							local126.drawRect(this.anInt4896 / 2 - 152, this.anInt4895 / 2 + -18, 303, 33);
							@Pc(180) String local180 = this.aBoolean221 ? arg1.aString12 : arg1.aString10 + " - " + local119 + "%";
							local126.setFont(local8);
							local126.setColor(Color.white);
							local126.drawString(local180, (this.anInt4896 - local12.stringWidth(local180)) / 2, this.anInt4895 / 2 + 4);
						}
					} catch (@Pc(210) Exception local210) {
					}
				}
			}
			local32.close();
			if (arg1.anInt4891 != arg1.anInt4890) {
				@Pc(228) byte[] local228 = new byte[arg1.anInt4890];
				@Pc(233) Inflater local233 = new Inflater(true);
				local233.setInput(local21);
				local21 = local228;
				local233.inflate(local228);
			}
		} catch (@Pc(244) Exception local244) {
			return null;
		}
		return this.method3846(arg1, local21) ? local21 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean220 = true;
		this.aBoolean219 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method3848(@OriginalArg(0) String arg0) {
		if (this.aBoolean217) {
			return;
		}
		this.aBoolean217 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BB)Z")
	private boolean method3849(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method3848("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean218 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean220 = false;
		this.aBoolean219 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4896 = Integer.parseInt(this.getParameter("width"));
			this.anInt4895 = Integer.parseInt(this.getParameter("height"));
			@Pc(13) int local13 = 32;
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local13 += local18;
			} catch (@Pc(24) Exception local24) {
			}
			try {
				@Pc(28) String local28 = this.getParameter("lang");
				if (local28 != null && local28.equals("1")) {
					this.aBoolean221 = true;
				}
			} catch (@Pc(39) Exception local39) {
			}
			@Pc(48) Class131 local48;
			try {
				local48 = new Class131(true, this, local13, "runescape", 27);
			} catch (@Pc(50) Exception local50) {
				this.method3848("nocache");
				return;
			}
			@Pc(59) ClassLoader_Sub1 local59 = new ClassLoader_Sub1();
			@Pc(68) byte[] local68;
			try {
				Class.forName("java.util.jar.Pack200");
				local68 = this.method3844(Class127.aClass128_2, local48);
				if (local68 == null) {
					return;
				}
				local59.anUnpack1 = new unpack_Sub1(local68);
			} catch (@Pc(80) Throwable local80) {
			}
			if (local59.anUnpack1 == null) {
				local68 = this.method3844(Class127.aClass128_1, local48);
				if (local68 == null) {
					return;
				}
				@Pc(100) ClassLoader_Sub1 local100 = new ClassLoader_Sub1();
				local100.anUnpack1 = new unpack(local68);
				@Pc(109) Class local109 = Class.forName("unpack");
				local100.aHashtable1.put(local109.getName(), local109);
				@Pc(120) Class local120 = local100.loadClass("unpackclass");
				@Pc(126) byte[] local126 = this.method3844(Class127.aClass128_3, local48);
				if (local126 == null) {
					return;
				}
				local59.anUnpack1 = (unpack) local120.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local126, Boolean.TRUE);
			}
			@Pc(159) Class local159 = Class.forName("Class129");
			local59.aHashtable1.put(local159.getName(), local159);
			@Pc(169) Class local169 = Class.forName("Class131");
			local59.aHashtable1.put(local169.getName(), local169);
			@Pc(179) Class local179 = Class.forName("Class130");
			local59.aHashtable1.put(local179.getName(), local179);
			@Pc(189) Class local189 = Class.forName("Interface5");
			local59.aHashtable1.put(local189.getName(), local189);
			@Pc(200) Class local200 = local59.loadClass("client");
			synchronized (this) {
				if (this.aBoolean218) {
					return;
				}
				this.anApplet2 = (Applet) local200.getDeclaredConstructor().newInstance();
				local200.getMethod("providesignlink", local169).invoke(null, local48);
				this.anApplet2.init();
				if (this.aBoolean219) {
					this.anApplet2.start();
				}
				if (this.aBoolean220) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(261) Exception local261) {
			RuntimeException_Sub2.anInt4888 = 1670866922;
			if (local261 instanceof InvocationTargetException) {
				@Pc(270) Throwable local270 = ((InvocationTargetException) local261).getTargetException();
				if (local270 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3834(this, local261.toString(), local270);
			} else {
				RuntimeException_Sub2.method3834(this, null, local261);
			}
			this.method3848("crash");
		}
	}
}
