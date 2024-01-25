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

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString128;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString129;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private static int anInt9666 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt9663;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt9665;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet5;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean673 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt9664 = 0;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean675 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean676 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean674 = false;

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet5 != null) {
			this.anApplet5.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString129 = this.getParameter("unsignedurl");
			if (aString129 != null) {
				try {
					@Pc(8) SecurityManager local8 = System.getSecurityManager();
					if (local8 != null) {
						local8.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean673 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString129), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString128 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || Class350.aStringArray39.length <= local36) {
					local36 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt9666 = Integer.parseInt(local64);
				if (anInt9666 < 0 || anInt9666 >= Class350.anIntArray738.length) {
					anInt9666 = 0;
				}
			}
			this.anInt9663 = this.getSize().width;
			this.anInt9665 = this.getSize().height;
			@Pc(97) int local97 = 32;
			try {
				@Pc(102) int local102 = Integer.parseInt(this.getParameter("modewhat"));
				local97 += local102;
			} catch (@Pc(108) Exception local108) {
			}
			try {
				@Pc(112) String local112 = this.getParameter("lang");
				if (local112 != null) {
					this.anInt9664 = Integer.parseInt(local112);
				}
			} catch (@Pc(122) Exception local122) {
			}
			Class351.method7906(local97, Class350.aStringArray39[local36]);
			@Pc(130) unpack local130 = null;
			@Pc(138) byte[] local138;
			try {
				Class.forName("java.util.jar.Pack200");
				local138 = this.method7910(Class350.aClass352_2);
				if (local138 == null) {
					return;
				}
				local130 = new unpack_Sub1(local138);
			} catch (@Pc(149) Throwable local149) {
			}
			if (local130 == null) {
				local138 = this.method7910(Class350.aClass352_1);
				if (local138 == null) {
					return;
				}
				@Pc(165) unpack local165 = new unpack(local138);
				@Pc(170) ClassLoader_Sub1 local170 = new ClassLoader_Sub1(local165);
				@Pc(173) Class local173 = Class.forName("unpack");
				local170.method7909(local173, local173.getName());
				@Pc(183) Class local183 = local170.loadClass("unpackclass");
				@Pc(188) byte[] local188 = this.method7910(Class350.aClass352_3);
				if (local188 == null) {
					return;
				}
				local130 = (unpack) local183.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local188, Boolean.TRUE);
			}
			@Pc(224) ClassLoader_Sub1 local224 = new ClassLoader_Sub1(local130);
			@Pc(227) Class local227 = Class.forName("Class351");
			local224.method7909(local227, local227.getName());
			@Pc(237) Class local237 = local224.loadClass("client");
			synchronized (this) {
				if (this.aBoolean674) {
					return;
				}
				this.anApplet5 = (Applet) local237.getDeclaredConstructor().newInstance();
				local237.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet5.init();
				if (this.aBoolean675) {
					this.anApplet5.start();
				}
				if (this.aBoolean676) {
					this.anApplet5.stop();
				}
			}
			this.anImage4 = null;
		} catch (@Pc(306) Exception local306) {
			RuntimeException_Sub2.anInt9658 = -811007419;
			if (local306 instanceof InvocationTargetException) {
				@Pc(315) Throwable local315 = ((InvocationTargetException) local306).getTargetException();
				if (local315 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method7899(local306.toString(), local315, this);
			} else {
				RuntimeException_Sub2.method7899(null, local306, this);
			}
			this.method7912("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!g;)[B")
	private byte[] method7910(@OriginalArg(1) Class352 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class351.method7908(arg0.aString127);
		} catch (@Pc(6) Exception local6) {
			this.method7912("nocache");
			return null;
		}
		@Pc(17) byte[] local17 = this.method7915(local4);
		if (!this.method7911(arg0, local17)) {
			local17 = this.method7913(false, arg0);
			if (local17 == null) {
				local17 = this.method7913(true, arg0);
			}
			if (local17 == null) {
				this.method7912("download");
				return null;
			}
			if (!this.method7914(local17, local4)) {
				return null;
			}
			local17 = this.method7915(local4);
			if (!this.method7911(arg0, local17)) {
				this.method7912("mismatch");
				return null;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean676 = true;
		this.aBoolean675 = false;
		if (this.anApplet5 != null) {
			this.anApplet5.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean674 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;[BZ)Z")
	private boolean method7911(@OriginalArg(0) Class352 arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(15) MessageDigest local15 = MessageDigest.getInstance("SHA");
			local15.reset();
			local15.update(arg1);
			@Pc(23) byte[] local23 = local15.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (arg0.anIntArray739[local25] != local23[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(45) Exception local45) {
			this.method7912("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method7912(@OriginalArg(1) String arg0) {
		if (this.aBoolean673) {
			return;
		}
		this.aBoolean673 = true;
		try {
			if (aString128 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString128 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(49) Exception local49) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!g;I)[B")
	private byte[] method7913(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class352 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class350.anIntArray738[anInt9666]);
		@Pc(26) Color local26 = new Color(Class350.anIntArray737[anInt9666]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt9660];
		try {
			@Pc(41) InputStream local41;
			if (arg0) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg1.aString126 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg1.aString126)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local87 < local30.length) {
				@Pc(101) int local101 = local30.length - local87;
				if (local101 > 1000) {
					local101 = 1000;
				}
				@Pc(113) int local113 = local41.read(local30, local87, local101);
				if (local113 < 0) {
					throw new EOFException();
				}
				local87 += local113;
				@Pc(134) int local134 = local87 * 100 / local30.length;
				if (local85 != local134) {
					try {
						@Pc(145) Graphics local145 = this.getGraphics();
						if (local145 == null) {
							this.repaint();
						} else {
							local85 = local134;
							@Pc(218) String local218;
							try {
								if (this.anImage4 == null) {
									this.anImage4 = this.createImage(this.anInt9663, this.anInt9665);
								}
								@Pc(171) Graphics local171 = this.anImage4.getGraphics();
								local171.setColor(Color.black);
								local171.fillRect(0, 0, this.anInt9663, this.anInt9665);
								local171.setColor(local19);
								local171.drawRect(this.anInt9663 / 2 - 152, this.anInt9665 / 2 + -18, 303, 33);
								local218 = arg1.aStringArray40[this.anInt9664] + " - " + local134 + "%";
								local171.setFont(local8);
								local171.setColor(local26);
								local171.drawString(local218, (this.anInt9663 - local12.stringWidth(local218)) / 2, this.anInt9665 / 2 + 4);
								local145.drawImage(this.anImage4, 0, 0, null);
							} catch (@Pc(252) Exception local252) {
								local145.setColor(Color.black);
								local145.fillRect(0, 0, this.anInt9663, this.anInt9665);
								local145.setColor(local19);
								local145.drawRect(this.anInt9663 / 2 - 152, this.anInt9665 / 2 + -18, 303, 33);
								local218 = arg1.aStringArray40[this.anInt9664] + " - " + local134 + "%";
								local145.setFont(local8);
								local145.setColor(local26);
								local145.drawString(local218, (this.anInt9663 - local12.stringWidth(local218)) / 2, this.anInt9665 / 2 + 4);
							}
						}
					} catch (@Pc(324) Exception local324) {
					}
				}
			}
			local41.close();
			if (arg1.anInt9660 != arg1.anInt9661) {
				@Pc(341) byte[] local341 = new byte[arg1.anInt9661];
				@Pc(346) Inflater local346 = new Inflater(true);
				local346.setInput(local30);
				local346.inflate(local341);
				local30 = local341;
			}
		} catch (@Pc(357) Exception local357) {
			return null;
		}
		return this.method7911(arg1, local30) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean676 = false;
		this.aBoolean675 = true;
		if (this.anApplet5 != null) {
			this.anApplet5.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean674 = true;
		this.aBoolean675 = this.aBoolean676 = false;
		if (this.anApplet5 != null) {
			this.anApplet5.destroy();
		}
		this.anApplet5 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet5 != null) {
			this.anApplet5.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method7914(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method7912("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method7915(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(31) byte[] local31 = new byte[local9];
			local20.readFully(local31, 0, local9);
			local20.close();
			return local31;
		} catch (@Pc(41) IOException local41) {
			return null;
		}
	}
}
