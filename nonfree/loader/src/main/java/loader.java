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

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString120;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString121;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private static int anInt9894 = 0;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt9893;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt9896;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean724 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean722 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean721 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt9895 = 0;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean723 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!g;)[B")
	private byte[] method8219(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class352 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class351.anIntArray849[anInt9894]);
		@Pc(26) Color local26 = new Color(Class351.anIntArray850[anInt9894]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt9890];
		try {
			@Pc(41) InputStream local41;
			if (arg0) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg1.aString119 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg1.aString119)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(92) int local92 = 0;
			while (local92 < local30.length) {
				@Pc(106) int local106 = local30.length - local92;
				if (local106 > 1000) {
					local106 = 1000;
				}
				@Pc(118) int local118 = local41.read(local30, local92, local106);
				if (local118 < 0) {
					throw new EOFException();
				}
				local92 += local118;
				@Pc(138) int local138 = local92 * 100 / local30.length;
				if (local85 != local138) {
					try {
						@Pc(149) Graphics local149 = this.getGraphics();
						if (local149 == null) {
							this.repaint();
						} else {
							local85 = local138;
							@Pc(222) String local222;
							try {
								if (this.anImage4 == null) {
									this.anImage4 = this.createImage(this.anInt9893, this.anInt9896);
								}
								@Pc(175) Graphics local175 = this.anImage4.getGraphics();
								local175.setColor(Color.black);
								local175.fillRect(0, 0, this.anInt9893, this.anInt9896);
								local175.setColor(local19);
								local175.drawRect(this.anInt9893 / 2 - 152, this.anInt9896 / 2 - 18, 303, 33);
								local222 = arg1.aStringArray51[this.anInt9895] + " - " + local138 + "%";
								local175.setFont(local8);
								local175.setColor(local26);
								local175.drawString(local222, (this.anInt9893 - local12.stringWidth(local222)) / 2, this.anInt9896 / 2 + 4);
								local149.drawImage(this.anImage4, 0, 0, null);
							} catch (@Pc(256) Exception local256) {
								local149.setColor(Color.black);
								local149.fillRect(0, 0, this.anInt9893, this.anInt9896);
								local149.setColor(local19);
								local149.drawRect(this.anInt9893 / 2 - 152, this.anInt9896 / 2 + -18, 303, 33);
								local222 = arg1.aStringArray51[this.anInt9895] + " - " + local138 + "%";
								local149.setFont(local8);
								local149.setColor(local26);
								local149.drawString(local222, (this.anInt9893 - local12.stringWidth(local222)) / 2, this.anInt9896 / 2 + 4);
							}
						}
					} catch (@Pc(328) Exception local328) {
					}
				}
			}
			local41.close();
			if (arg1.anInt9890 != arg1.anInt9891) {
				@Pc(342) byte[] local342 = new byte[arg1.anInt9891];
				@Pc(347) Inflater local347 = new Inflater(true);
				local347.setInput(local30);
				local30 = local342;
				local347.inflate(local342);
			}
		} catch (@Pc(358) Exception local358) {
			return null;
		}
		return this.method8220(local30, arg1) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean721 = false;
		this.aBoolean722 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLloader!g;)Z")
	private boolean method8220(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class352 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(16) byte[] local16 = local8.digest();
			for (@Pc(23) int local23 = 0; local23 < 20; local23++) {
				if (arg1.anIntArray851[local23] != local16[local23]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(47) Exception local47) {
			this.method8221("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean722 = false;
		this.aBoolean721 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean723 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
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
			aString120 = this.getParameter("unsignedurl");
			if (aString120 != null) {
				try {
					@Pc(8) SecurityManager local8 = System.getSecurityManager();
					if (local8 != null) {
						local8.checkExec("echo");
					}
				} catch (@Pc(15) SecurityException local15) {
					this.aBoolean724 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString120), "_parent");
					} catch (@Pc(28) Exception local28) {
					}
					return;
				}
			}
			aString121 = this.getParameter("crashurl");
			@Pc(35) int local35 = 0;
			@Pc(39) String local39 = this.getParameter("cachesubdirid");
			if (local39 != null) {
				local35 = Integer.parseInt(local39);
				if (local35 < 0 || Class351.aStringArray50.length <= local35) {
					local35 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt9894 = Integer.parseInt(local62);
				if (anInt9894 < 0 || anInt9894 >= Class351.anIntArray849.length) {
					anInt9894 = 0;
				}
			}
			this.anInt9893 = this.getSize().width;
			this.anInt9896 = this.getSize().height;
			@Pc(93) int local93 = 32;
			try {
				@Pc(98) int local98 = Integer.parseInt(this.getParameter("modewhat"));
				local93 += local98;
			} catch (@Pc(104) Exception local104) {
			}
			try {
				@Pc(108) String local108 = this.getParameter("lang");
				if (local108 != null) {
					this.anInt9895 = Integer.parseInt(local108);
				}
			} catch (@Pc(117) Exception local117) {
			}
			Class353.method8225(Class351.aStringArray50[local35], local93);
			@Pc(125) unpack local125 = null;
			@Pc(133) byte[] local133;
			try {
				Class.forName("java.util.jar.Pack200");
				local133 = this.method8222(Class351.aClass352_2);
				if (local133 == null) {
					return;
				}
				local125 = new unpack_Sub1(local133);
			} catch (@Pc(145) Throwable local145) {
			}
			if (local125 == null) {
				local133 = this.method8222(Class351.aClass352_1);
				if (local133 == null) {
					return;
				}
				@Pc(163) unpack local163 = new unpack(local133);
				@Pc(168) ClassLoader_Sub1 local168 = new ClassLoader_Sub1(local163);
				@Pc(171) Class local171 = Class.forName("unpack");
				local168.method8215(local171.getName(), local171);
				@Pc(181) Class local181 = local168.loadClass("unpackclass");
				@Pc(186) byte[] local186 = this.method8222(Class351.aClass352_3);
				if (local186 == null) {
					return;
				}
				local125 = (unpack) local181.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local186, Boolean.TRUE);
			}
			@Pc(221) ClassLoader_Sub1 local221 = new ClassLoader_Sub1(local125);
			@Pc(224) Class local224 = Class.forName("Class353");
			local221.method8215(local224.getName(), local224);
			@Pc(234) Class local234 = local221.loadClass("client");
			synchronized (this) {
				if (this.aBoolean723) {
					return;
				}
				this.anApplet3 = (Applet) local234.getDeclaredConstructor().newInstance();
				local234.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean722) {
					this.anApplet3.start();
				}
				if (this.aBoolean721) {
					this.anApplet3.stop();
				}
			}
			this.anImage4 = null;
		} catch (@Pc(305) Exception local305) {
			RuntimeException_Sub2.anInt9889 = 1049963184;
			if (local305 instanceof InvocationTargetException) {
				@Pc(314) Throwable local314 = ((InvocationTargetException) local305).getTargetException();
				if (local314 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8214(this, local305.toString(), local314);
			} else {
				RuntimeException_Sub2.method8214(this, null, local305);
			}
			this.method8221("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method8221(@OriginalArg(1) String arg0) {
		if (this.aBoolean724) {
			return;
		}
		this.aBoolean724 = true;
		try {
			if (aString121 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString121 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean723 = true;
		this.aBoolean722 = this.aBoolean721 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;B)[B")
	private byte[] method8222(@OriginalArg(0) Class352 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class353.method8226(arg0.aString118);
		} catch (@Pc(6) Exception local6) {
			this.method8221("nocache");
			return null;
		}
		@Pc(19) byte[] local19 = this.method8223(local4);
		if (!this.method8220(local19, arg0)) {
			local19 = this.method8219(false, arg0);
			if (local19 == null) {
				local19 = this.method8219(true, arg0);
			}
			if (local19 == null) {
				this.method8221("download");
				return null;
			}
			if (!this.method8224(local19, local4)) {
				return null;
			}
			local19 = this.method8223(local4);
			if (!this.method8220(local19, arg0)) {
				this.method8221("mismatch");
				return null;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method8223(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method8224(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method8221("savefile");
			return false;
		}
	}
}
