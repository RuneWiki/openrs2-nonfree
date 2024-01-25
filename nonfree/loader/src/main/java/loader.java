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
	private static String aString89;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString90;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private static int anInt9500 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt9499;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt9501;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean691 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean692 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean693 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean694 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt9502 = 0;

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean691 = this.aBoolean693 = false;
		this.aBoolean694 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean694 = false;
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
			aString90 = this.getParameter("unsignedurl");
			if (aString90 != null) {
				try {
					@Pc(7) SecurityManager local7 = System.getSecurityManager();
					if (local7 != null) {
						local7.checkExec("echo");
					}
				} catch (@Pc(15) SecurityException local15) {
					this.aBoolean692 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString90), "_parent");
					} catch (@Pc(28) Exception local28) {
					}
					return;
				}
			}
			aString89 = this.getParameter("crashurl");
			@Pc(35) int local35 = 0;
			@Pc(39) String local39 = this.getParameter("cachesubdirid");
			if (local39 != null) {
				local35 = Integer.parseInt(local39);
				if (local35 < 0 || local35 >= Class327.aStringArray54.length) {
					local35 = 0;
				}
			}
			@Pc(60) String local60 = this.getParameter("colourid");
			if (local60 != null) {
				anInt9500 = Integer.parseInt(local60);
				if (anInt9500 < 0 || Class327.anIntArray783.length <= anInt9500) {
					anInt9500 = 0;
				}
			}
			this.anInt9499 = this.getSize().width;
			this.anInt9501 = this.getSize().height;
			@Pc(90) int local90 = 32;
			try {
				@Pc(95) int local95 = Integer.parseInt(this.getParameter("modewhat"));
				local90 += local95;
			} catch (@Pc(101) Exception local101) {
			}
			try {
				@Pc(105) String local105 = this.getParameter("lang");
				if (local105 != null) {
					this.anInt9502 = Integer.parseInt(local105);
				}
			} catch (@Pc(113) Exception local113) {
			}
			Class329.method7851(local90, Class327.aStringArray54[local35]);
			@Pc(121) unpack local121 = null;
			@Pc(129) byte[] local129;
			try {
				Class.forName("java.util.jar.Pack200");
				local129 = this.method7844(Class327.aClass328_2);
				if (local129 == null) {
					return;
				}
				local121 = new unpack_Sub1(local129);
			} catch (@Pc(141) Throwable local141) {
			}
			if (local121 == null) {
				local129 = this.method7844(Class327.aClass328_1);
				if (local129 == null) {
					return;
				}
				@Pc(158) unpack local158 = new unpack(local129);
				@Pc(163) ClassLoader_Sub1 local163 = new ClassLoader_Sub1(local158);
				@Pc(166) Class local166 = Class.forName("unpack");
				local163.method7835(local166.getName(), local166);
				@Pc(176) Class local176 = local163.loadClass("unpackclass");
				@Pc(181) byte[] local181 = this.method7844(Class327.aClass328_3);
				if (local181 == null) {
					return;
				}
				local121 = (unpack) local176.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local181, Boolean.TRUE);
			}
			@Pc(215) ClassLoader_Sub1 local215 = new ClassLoader_Sub1(local121);
			@Pc(218) Class local218 = Class.forName("Class329");
			local215.method7835(local218.getName(), local218);
			@Pc(228) Class local228 = local215.loadClass("client");
			synchronized (this) {
				if (this.aBoolean694) {
					return;
				}
				this.anApplet3 = (Applet) local228.getDeclaredConstructor().newInstance();
				local228.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean691) {
					this.anApplet3.start();
				}
				if (this.aBoolean693) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(295) Exception local295) {
			RuntimeException_Sub2.anInt9498 = 1046077284;
			if (local295 instanceof InvocationTargetException) {
				@Pc(311) Throwable local311 = ((InvocationTargetException) local295).getTargetException();
				if (local311 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method7836(local311, local295.toString(), this);
			} else {
				RuntimeException_Sub2.method7836(local295, null, this);
			}
			this.method7845("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean693 = true;
		this.aBoolean691 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;B)[B")
	private byte[] method7844(@OriginalArg(0) Class328 arg0) {
		@Pc(13) File local13;
		try {
			local13 = Class329.method7850(arg0.aString87);
		} catch (@Pc(15) Exception local15) {
			this.method7845("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method7849(local13);
		if (!this.method7848(local26, arg0)) {
			local26 = this.method7846(arg0, false);
			if (local26 == null) {
				local26 = this.method7846(arg0, true);
			}
			if (local26 == null) {
				this.method7845("download");
				return null;
			}
			if (!this.method7847(local26, local13)) {
				return null;
			}
			local26 = this.method7849(local13);
			if (!this.method7848(local26, arg0)) {
				this.method7845("mismatch");
				return null;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method7845(@OriginalArg(1) String arg0) {
		if (this.aBoolean692) {
			return;
		}
		this.aBoolean692 = true;
		try {
			if (aString89 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString89 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean691 = true;
		this.aBoolean693 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;IZ)[B")
	private byte[] method7846(@OriginalArg(0) Class328 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local8);
		@Pc(25) Color local25 = new Color(Class327.anIntArray783[anInt9500]);
		@Pc(32) Color local32 = new Color(Class327.anIntArray782[anInt9500]);
		@Pc(36) byte[] local36 = new byte[arg0.anInt9495];
		try {
			@Pc(78) InputStream local78;
			if (arg1) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg0.aString86 + "\n\n").getBytes());
				local78 = local49.getInputStream();
			} else {
				local78 = (new URL(this.getCodeBase(), arg0.aString86)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local36.length > local93) {
				@Pc(103) int local103 = local36.length - local93;
				if (local103 > 1000) {
					local103 = 1000;
				}
				@Pc(115) int local115 = local78.read(local36, local93, local103);
				if (local115 < 0) {
					throw new EOFException();
				}
				local93 += local115;
				@Pc(135) int local135 = local93 * 100 / local36.length;
				if (local135 != local91) {
					try {
						@Pc(141) Graphics local141 = this.getGraphics();
						if (local141 == null) {
							this.repaint();
						} else {
							local91 = local135;
							@Pc(208) String local208;
							try {
								if (this.anImage7 == null) {
									this.anImage7 = this.createImage(this.anInt9499, this.anInt9501);
								}
								@Pc(161) Graphics local161 = this.anImage7.getGraphics();
								local161.setColor(Color.black);
								local161.fillRect(0, 0, this.anInt9499, this.anInt9501);
								local161.setColor(local25);
								local161.drawRect(this.anInt9499 / 2 - 152, this.anInt9501 / 2 - 18, 303, 33);
								local208 = arg0.aStringArray55[this.anInt9502] + " - " + local135 + "%";
								local161.setFont(local8);
								local161.setColor(local32);
								local161.drawString(local208, (this.anInt9499 - local18.stringWidth(local208)) / 2, this.anInt9501 / 2 + 4);
								local141.drawImage(this.anImage7, 0, 0, null);
							} catch (@Pc(241) Exception local241) {
								local141.setColor(Color.black);
								local141.fillRect(0, 0, this.anInt9499, this.anInt9501);
								local141.setColor(local25);
								local141.drawRect(this.anInt9499 / 2 - 152, this.anInt9501 / 2 + -18, 303, 33);
								local208 = arg0.aStringArray55[this.anInt9502] + " - " + local135 + "%";
								local141.setFont(local8);
								local141.setColor(local32);
								local141.drawString(local208, (this.anInt9499 - local18.stringWidth(local208)) / 2, this.anInt9501 / 2 + 4);
							}
						}
					} catch (@Pc(318) Exception local318) {
					}
				}
			}
			local78.close();
			if (arg0.anInt9496 != arg0.anInt9495) {
				@Pc(335) byte[] local335 = new byte[arg0.anInt9496];
				@Pc(340) Inflater local340 = new Inflater(true);
				local340.setInput(local36);
				local340.inflate(local335);
				local36 = local335;
			}
		} catch (@Pc(351) Exception local351) {
			return null;
		}
		return this.method7848(local36, arg0) ? local36 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLjava/io/File;)Z")
	private boolean method7847(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method7845("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z[BLloader!e;)Z")
	private boolean method7848(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class328 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(23) byte[] local23 = local8.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (local23[local25] != arg1.anIntArray784[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(43) Exception local43) {
			this.method7845("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method7849(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(32) IOException local32) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}
}
