import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString101;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString102;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private static int anInt10009 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt10010;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt10011;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean679 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean678 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean677 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean680 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "I")
	private int anInt10012 = 0;

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;ZZ)[B")
	private byte[] method7985(@OriginalArg(0) Class355 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class354.anIntArray729[anInt10009]);
		@Pc(26) Color local26 = new Color(Class354.anIntArray730[anInt10009]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt10005];
		try {
			@Pc(72) InputStream local72;
			if (arg1) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg0.aString97 + "\n\n").getBytes());
				local72 = local43.getInputStream();
			} else {
				local72 = (new URL(this.getCodeBase(), arg0.aString97)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local30.length > local87) {
				@Pc(106) int local106 = local30.length - local87;
				if (local106 > 1000) {
					local106 = 1000;
				}
				@Pc(119) int local119 = local72.read(local30, local87, local106);
				if (local119 < 0) {
					throw new EOFException();
				}
				local87 += local119;
				@Pc(140) int local140 = local87 * 100 / local30.length;
				if (local85 != local140) {
					try {
						@Pc(151) Graphics local151 = this.getGraphics();
						if (local151 == null) {
							this.repaint();
						} else {
							@Pc(215) String local215;
							try {
								if (this.anImage4 == null) {
									this.anImage4 = this.createImage(this.anInt10010, this.anInt10011);
								}
								@Pc(168) Graphics local168 = this.anImage4.getGraphics();
								local168.setColor(Color.black);
								local168.fillRect(0, 0, this.anInt10010, this.anInt10011);
								local168.setColor(local19);
								local168.drawRect(this.anInt10010 / 2 - 152, this.anInt10011 / 2 - 18, 303, 33);
								local215 = arg0.aStringArray42[this.anInt10012] + " - " + local140 + "%";
								local168.setFont(local8);
								local168.setColor(local26);
								local168.drawString(local215, (this.anInt10010 - local12.stringWidth(local215)) / 2, this.anInt10011 / 2 + 4);
								local151.drawImage(this.anImage4, 0, 0, null);
							} catch (@Pc(248) Exception local248) {
								local151.setColor(Color.black);
								local151.fillRect(0, 0, this.anInt10010, this.anInt10011);
								local151.setColor(local19);
								local151.drawRect(this.anInt10010 / 2 - 152, this.anInt10011 / 2 + -18, 303, 33);
								local215 = arg0.aStringArray42[this.anInt10012] + " - " + local140 + "%";
								local151.setFont(local8);
								local151.setColor(local26);
								local151.drawString(local215, (this.anInt10010 - local12.stringWidth(local215)) / 2, this.anInt10011 / 2 + 4);
							}
							local85 = local140;
						}
					} catch (@Pc(327) Exception local327) {
					}
				}
			}
			local72.close();
			if (arg0.anInt10005 != arg0.anInt10006) {
				@Pc(340) byte[] local340 = new byte[arg0.anInt10006];
				@Pc(345) Inflater local345 = new Inflater(true);
				local345.setInput(local30);
				local345.inflate(local340);
				local30 = local340;
			}
		} catch (@Pc(356) Exception local356) {
			return null;
		}
		return this.method7989(local30, arg0) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;Z)[B")
	private byte[] method7986(@OriginalArg(0) Class355 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class356.method7982(arg0.aString98);
		} catch (@Pc(6) Exception local6) {
			this.method7988("nocache");
			return null;
		}
		@Pc(17) byte[] local17 = this.method7987(local4);
		if (!this.method7989(local17, arg0)) {
			local17 = this.method7985(arg0, false);
			if (local17 == null) {
				local17 = this.method7985(arg0, true);
			}
			if (local17 == null) {
				this.method7988("download");
				return null;
			}
			if (!this.method7990(local4, local17)) {
				return null;
			}
			local17 = this.method7987(local4);
			if (!this.method7989(local17, arg0)) {
				this.method7988("mismatch");
				return null;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean678 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean677 = true;
		this.aBoolean680 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method7987(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(15) int local15 = (int) arg0.length();
			@Pc(26) DataInputStream local26 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(29) byte[] local29 = new byte[local15];
			local26.readFully(local29, 0, local15);
			local26.close();
			return local29;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method7988(@OriginalArg(1) String arg0) {
		if (this.aBoolean679) {
			return;
		}
		this.aBoolean679 = true;
		try {
			if (aString101 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString101 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString102 = this.getParameter("unsignedurl");
			if (aString102 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean679 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString102), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString101 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || local38 >= Class354.aStringArray41.length) {
					local38 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt10009 = Integer.parseInt(local62);
				if (anInt10009 < 0 || anInt10009 >= Class354.anIntArray729.length) {
					anInt10009 = 0;
				}
			}
			this.anInt10010 = this.getSize().width;
			this.anInt10011 = this.getSize().height;
			@Pc(90) int local90 = 32;
			try {
				@Pc(95) int local95 = Integer.parseInt(this.getParameter("modewhat"));
				local90 += local95;
			} catch (@Pc(101) Exception local101) {
			}
			try {
				@Pc(105) String local105 = this.getParameter("lang");
				if (local105 != null) {
					this.anInt10012 = Integer.parseInt(local105);
				}
			} catch (@Pc(114) Exception local114) {
			}
			Class356.method7983(local90, Class354.aStringArray41[local38]);
			@Pc(122) unpack local122 = null;
			@Pc(130) byte[] local130;
			try {
				Class.forName("java.util.jar.Pack200");
				local130 = this.method7986(Class354.aClass355_2);
				if (local130 == null) {
					return;
				}
				local122 = new unpack_Sub1(local130);
			} catch (@Pc(142) Throwable local142) {
			}
			if (local122 == null) {
				local130 = this.method7986(Class354.aClass355_1);
				if (local130 == null) {
					return;
				}
				@Pc(159) unpack local159 = new unpack(local130);
				@Pc(164) ClassLoader_Sub1 local164 = new ClassLoader_Sub1(local159);
				@Pc(167) Class local167 = Class.forName("unpack");
				local164.method7984(local167, local167.getName());
				@Pc(177) Class local177 = local164.loadClass("unpackclass");
				@Pc(182) byte[] local182 = this.method7986(Class354.aClass355_3);
				if (local182 == null) {
					return;
				}
				local122 = (unpack) local177.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local182, Boolean.TRUE);
			}
			@Pc(218) ClassLoader_Sub1 local218 = new ClassLoader_Sub1(local122);
			@Pc(221) Class local221 = Class.forName("Class356");
			local218.method7984(local221, local221.getName());
			@Pc(231) Class local231 = local218.loadClass("client");
			synchronized (this) {
				if (this.aBoolean678) {
					return;
				}
				this.anApplet3 = (Applet) local231.getDeclaredConstructor().newInstance();
				local231.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean680) {
					this.anApplet3.start();
				}
				if (this.aBoolean677) {
					this.anApplet3.stop();
				}
			}
			this.anImage4 = null;
		} catch (@Pc(301) Exception local301) {
			RuntimeException_Sub2.anInt10004 = -1781704399;
			if (local301 instanceof InvocationTargetException) {
				@Pc(317) Throwable local317 = ((InvocationTargetException) local301).getTargetException();
				if (local317 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method7976(local317, local301.toString(), this);
			} else {
				RuntimeException_Sub2.method7976(local301, null, this);
			}
			this.method7988("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLloader!e;)Z")
	private boolean method7989(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class355 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(17) MessageDigest local17 = MessageDigest.getInstance("SHA");
			local17.reset();
			local17.update(arg0);
			@Pc(25) byte[] local25 = local17.digest();
			for (@Pc(27) int local27 = 0; local27 < 20; local27++) {
				if (local25[local27] != arg1.anIntArray731[local27]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(51) Exception local51) {
			this.method7988("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean680 = this.aBoolean677 = false;
		this.aBoolean678 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B[B)Z")
	private boolean method7990(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(26) IOException local26) {
			this.method7988("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean677 = false;
		this.aBoolean680 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}
}
