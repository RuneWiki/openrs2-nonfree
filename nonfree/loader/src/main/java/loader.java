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

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString119;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString120;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private static int anInt9735 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt9734;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt9737;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean691 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean690 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean692 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt9736 = 0;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean693 = false;

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!h;Lloader!dj;I)[B")
	private byte[] method8071(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class325 arg1) {
		@Pc(11) File local11;
		try {
			local11 = arg1.method8037(arg0.aString118, -8300);
		} catch (@Pc(13) Exception local13) {
			this.method8075("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method8076(local11);
		if (!this.method8074(local24, arg0)) {
			local24 = this.method8072(false, arg0);
			if (local24 == null) {
				local24 = this.method8072(true, arg0);
			}
			if (local24 == null) {
				this.method8075("download");
				return null;
			}
			if (!this.method8073(local24, local11)) {
				return null;
			}
			local24 = this.method8076(local11);
			if (!this.method8074(local24, arg0)) {
				this.method8075("mismatch");
				return null;
			}
		}
		return local24;
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
		this.aBoolean690 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!h;)[B")
	private byte[] method8072(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class327 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class321.anIntArray708[anInt9735]);
		@Pc(26) Color local26 = new Color(Class321.anIntArray709[anInt9735]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt9733];
		try {
			@Pc(72) InputStream local72;
			if (arg0) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg1.aString117 + "\n\n").getBytes());
				local72 = local43.getInputStream();
			} else {
				local72 = (new URL(this.getCodeBase(), arg1.aString117)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local87 < local30.length) {
				@Pc(100) int local100 = local30.length - local87;
				if (local100 > 1000) {
					local100 = 1000;
				}
				@Pc(114) int local114 = local72.read(local30, local87, local100);
				if (local114 < 0) {
					throw new EOFException();
				}
				local87 += local114;
				@Pc(134) int local134 = local87 * 100 / local30.length;
				if (local85 != local134) {
					try {
						@Pc(140) Graphics local140 = this.getGraphics();
						if (local140 == null) {
							this.repaint();
						} else {
							local140.setColor(Color.black);
							local140.fillRect(0, 0, this.anInt9734, this.anInt9737);
							local140.setColor(local19);
							local140.drawRect(this.anInt9734 / 2 - 152, this.anInt9737 / 2 + -18, 303, 33);
							@Pc(194) String local194 = arg1.aStringArray63[this.anInt9736] + " - " + local134 + "%";
							local140.setFont(local8);
							local140.setColor(local26);
							local85 = local134;
							local140.drawString(local194, (this.anInt9734 - local12.stringWidth(local194)) / 2, this.anInt9737 / 2 + 4);
						}
					} catch (@Pc(222) Exception local222) {
					}
				}
			}
			local72.close();
			if (arg1.anInt9732 != arg1.anInt9733) {
				@Pc(245) byte[] local245 = new byte[arg1.anInt9732];
				@Pc(250) Inflater local250 = new Inflater(true);
				local250.setInput(local30);
				local30 = local245;
				local250.inflate(local245);
			}
		} catch (@Pc(261) Exception local261) {
			return null;
		}
		return this.method8074(local30, arg1) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/io/File;)Z")
	private boolean method8073(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method8075("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString119 = this.getParameter("unsignedurl");
			if (aString119 != null) {
				try {
					@Pc(7) SecurityManager local7 = System.getSecurityManager();
					if (local7 != null) {
						local7.checkExec("echo");
					}
				} catch (@Pc(14) SecurityException local14) {
					this.aBoolean691 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString119), "_parent");
					} catch (@Pc(27) Exception local27) {
					}
					return;
				}
			}
			aString120 = this.getParameter("crashurl");
			@Pc(34) int local34 = 0;
			@Pc(38) String local38 = this.getParameter("cachesubdirid");
			if (local38 != null) {
				local34 = Integer.parseInt(local38);
				if (local34 < 0 || local34 >= Class321.aStringArray62.length) {
					local34 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt9735 = Integer.parseInt(local62);
				if (anInt9735 < 0 || Class321.anIntArray708.length <= anInt9735) {
					anInt9735 = 0;
				}
			}
			this.anInt9734 = this.getSize().width;
			this.anInt9737 = this.getSize().height;
			@Pc(93) int local93 = 32;
			try {
				@Pc(98) int local98 = Integer.parseInt(this.getParameter("modewhat"));
				local93 += local98;
			} catch (@Pc(104) Exception local104) {
			}
			try {
				@Pc(108) String local108 = this.getParameter("lang");
				if (local108 != null) {
					this.anInt9736 = Integer.parseInt(local108);
				}
			} catch (@Pc(118) Exception local118) {
			}
			@Pc(128) Class325 local128;
			try {
				local128 = new Class325(this, local93, Class321.aStringArray62[local34], 32);
			} catch (@Pc(130) Exception local130) {
				this.method8075("nocache");
				return;
			}
			@Pc(137) unpack local137 = null;
			@Pc(146) byte[] local146;
			try {
				Class.forName("java.util.jar.Pack200");
				local146 = this.method8071(Class321.aClass327_2, local128);
				if (local146 == null) {
					return;
				}
				local137 = new unpack_Sub1(local146);
			} catch (@Pc(157) Throwable local157) {
			}
			if (local137 == null) {
				local146 = this.method8071(Class321.aClass327_1, local128);
				if (local146 == null) {
					return;
				}
				@Pc(174) unpack local174 = new unpack(local146);
				@Pc(179) ClassLoader_Sub1 local179 = new ClassLoader_Sub1(local174);
				@Pc(182) Class local182 = Class.forName("unpack");
				local179.method8066(local182.getName(), local182);
				@Pc(192) Class local192 = local179.loadClass("unpackclass");
				@Pc(198) byte[] local198 = this.method8071(Class321.aClass327_3, local128);
				if (local198 == null) {
					return;
				}
				local137 = (unpack) local192.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local198, Boolean.TRUE);
			}
			@Pc(233) ClassLoader_Sub1 local233 = new ClassLoader_Sub1(local137);
			@Pc(236) Class local236 = Class.forName("Class328");
			local233.method8066(local236.getName(), local236);
			@Pc(245) Class local245 = Class.forName("Class325");
			local233.method8066(local245.getName(), local245);
			@Pc(254) Class local254 = Class.forName("Class323");
			local233.method8066(local254.getName(), local254);
			@Pc(263) Class local263 = Class.forName("Class324");
			local233.method8066(local263.getName(), local263);
			@Pc(272) Class local272 = Class.forName("Interface22");
			local233.method8066(local272.getName(), local272);
			@Pc(282) Class local282 = local233.loadClass("client");
			synchronized (this) {
				if (this.aBoolean690) {
					return;
				}
				this.anApplet3 = (Applet) local282.getDeclaredConstructor().newInstance();
				local282.getMethod("providesignlink", local245).invoke(null, local128);
				this.anApplet3.init();
				if (this.aBoolean692) {
					this.anApplet3.start();
				}
				if (this.aBoolean693) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(343) Exception local343) {
			RuntimeException_Sub2.anInt9728 = 1275367488;
			if (local343 instanceof InvocationTargetException) {
				@Pc(352) Throwable local352 = ((InvocationTargetException) local343).getTargetException();
				if (local352 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8035(local343.toString(), this, local352);
			} else {
				RuntimeException_Sub2.method8035(null, this, local343);
			}
			this.method8075("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean692 = this.aBoolean693 = false;
		this.aBoolean690 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLloader!h;)Z")
	private boolean method8074(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class327 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(13) MessageDigest local13 = MessageDigest.getInstance("SHA");
			local13.reset();
			local13.update(arg0);
			@Pc(21) byte[] local21 = local13.digest();
			for (@Pc(23) int local23 = 0; local23 < 20; local23++) {
				if (arg1.anIntArray710[local23] != local21[local23]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method8075("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method8075(@OriginalArg(0) String arg0) {
		if (this.aBoolean691) {
			return;
		}
		this.aBoolean691 = true;
		try {
			if (aString120 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString120 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean692 = true;
		this.aBoolean693 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Z)[B")
	private byte[] method8076(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local8];
			local19.readFully(local28, 0, local8);
			local19.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean692 = false;
		this.aBoolean693 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}
}
