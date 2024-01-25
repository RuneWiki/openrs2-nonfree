import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.MediaTracker;
import java.awt.Toolkit;
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
	private static String aString139;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString140;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private static int anInt10937 = 0;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean774;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt10938;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt10939;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!d;")
	private Class401 lb;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt10936 = 0;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean775 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean776 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean777 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean773 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method9241(@OriginalArg(1) String arg0) {
		if (this.aBoolean777) {
			return;
		}
		this.aBoolean777 = true;
		try {
			if (aString140 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString140 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9242(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt10938 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method9243(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(17) InputStream local17 = this.getClass().getResourceAsStream(arg0);
			@Pc(20) byte[] local20 = new byte[3000];
			@Pc(22) int local22 = 0;
			@Pc(27) int local27;
			while ((local27 = local17.read()) != -1) {
				local20[local22++] = (byte) local27;
			}
			return Toolkit.getDefaultToolkit().createImage(local20);
		} catch (@Pc(45) Exception local45) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method9244(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Class402.aClass401Array1[anInt10937] == null || this.aBoolean774 ? this.method9250(arg1, arg0) : this.method9254(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IB)I")
	private int method9245(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt10939 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString139 = this.getParameter("unsignedurl");
			if (aString139 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean777 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString139), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString140 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || Class402.aStringArray44.length <= local37) {
					local37 = 0;
				}
			}
			@Pc(59) String local59 = this.getParameter("colourid");
			if (local59 != null) {
				anInt10937 = Integer.parseInt(local59);
				if (anInt10937 < 0 || anInt10937 >= Class402.anIntArray626.length) {
					anInt10937 = 0;
				}
			}
			this.lb = Class402.aClass401Array1[anInt10937];
			this.anInt10938 = this.getSize().width;
			this.anInt10939 = this.getSize().height;
			@Pc(96) int local96 = 32;
			try {
				@Pc(101) int local101 = Integer.parseInt(this.getParameter("modewhat"));
				local96 += local101;
			} catch (@Pc(107) Exception local107) {
			}
			try {
				@Pc(111) String local111 = this.getParameter("lang");
				if (local111 != null) {
					this.anInt10936 = Integer.parseInt(local111);
				}
			} catch (@Pc(121) Exception local121) {
			}
			Class399.method9233(Class402.aStringArray44[local37], local96);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString129, 0, this.lb.anInt10934);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10933);
					this.bar = this.method9243(this.lb.aString133);
					this.background = this.method9243(this.lb.aString131);
					this.left = this.method9243(this.lb.aString137);
					this.right = this.method9243(this.lb.aString135);
					this.top = this.method9243(this.lb.aString134);
					this.bottom = this.method9243(this.lb.aString132);
					this.bodyLeft = this.method9243(this.lb.aString128);
					this.bodyRight = this.method9243(this.lb.aString136);
					this.bodyFill = this.method9243(this.lb.aString130);
					@Pc(276) Image[] local276 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(281) MediaTracker local281 = new MediaTracker(this);
					for (@Pc(283) int local283 = 0; local283 < local276.length; local283++) {
						local281.addImage(local276[local283], local283);
					}
					while (true) {
						try {
							local281.waitForAll();
							break;
						} catch (@Pc(304) InterruptedException local304) {
						}
					}
				} catch (@Pc(308) Throwable local308) {
					this.method9249();
				}
			}
			@Pc(313) unpack local313 = null;
			@Pc(321) byte[] local321;
			try {
				Class.forName("java.util.jar.Pack200");
				local321 = this.method9252(Class402.aClass400_2);
				if (local321 == null) {
					return;
				}
				local313 = new unpack_Sub1(local321);
			} catch (@Pc(331) Throwable local331) {
			}
			if (local313 == null) {
				local321 = this.method9252(Class402.aClass400_1);
				if (local321 == null) {
					return;
				}
				@Pc(350) unpack local350 = new unpack(local321);
				@Pc(355) ClassLoader_Sub1 local355 = new ClassLoader_Sub1(local350);
				@Pc(358) Class local358 = Class.forName("unpack");
				local355.method9235(local358.getName(), local358);
				@Pc(368) Class local368 = local355.loadClass("unpackclass");
				@Pc(373) byte[] local373 = this.method9252(Class402.aClass400_3);
				if (local373 == null) {
					return;
				}
				local313 = (unpack) local368.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local373, Boolean.TRUE);
			}
			@Pc(408) ClassLoader_Sub1 local408 = new ClassLoader_Sub1(local313);
			@Pc(411) Class local411 = Class.forName("Class399");
			local408.method9235(local411.getName(), local411);
			@Pc(421) Class local421 = local408.loadClass("client");
			synchronized (this) {
				if (this.aBoolean776) {
					return;
				}
				this.anApplet3 = (Applet) local421.getDeclaredConstructor().newInstance();
				local421.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean775) {
					this.anApplet3.start();
				}
				if (this.aBoolean773) {
					this.anApplet3.stop();
				}
			}
			this.method9253();
		} catch (@Pc(491) Exception local491) {
			RuntimeException_Sub2.anInt10935 = 1966449010;
			if (local491 instanceof InvocationTargetException) {
				@Pc(500) Throwable local500 = ((InvocationTargetException) local491).getTargetException();
				if (local500 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9237(local491.toString(), this, local500);
			} else {
				RuntimeException_Sub2.method9237((String) null, this, local491);
			}
			this.method9241("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;)[B")
	private byte[] method9246(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(43) IOException local43) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method9247(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method9241("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!c;I)Z")
	private boolean method9248(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class400 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (local17[local19] != arg1.anIntArray625[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(44) Exception local44) {
			this.method9241("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method9249() {
		this.bfm = null;
		this.bf = null;
		this.aBoolean774 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;)Z")
	private boolean method9250(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class402.anIntArray626[anInt10937]);
			this.aColor2 = new Color(Class402.anIntArray627[anInt10937]);
			this.colourtext = new Color(Class402.anIntArray628[anInt10937]);
		}
		@Pc(44) Graphics local44 = this.getGraphics();
		if (local44 == null) {
			this.repaint();
			return false;
		}
		@Pc(85) int local85;
		@Pc(92) int local92;
		@Pc(158) String local158;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10938, this.anInt10939);
			}
			@Pc(63) Graphics local63 = this.anImage14.getGraphics();
			local63.setColor(Color.black);
			local63.fillRect(0, 0, this.anInt10938, this.anInt10939);
			local63.setColor(this.aColor3);
			local85 = this.anInt10938 / 2 - 152;
			local92 = this.anInt10939 / 2 - 18;
			local63.drawRect(local85, local92, 303, 33);
			local63.setColor(this.aColor2);
			local63.fillRect(local85 + 2, local92 - -2, arg0 * 3, 30);
			local63.setColor(Color.black);
			local63.drawRect(local85 + 1, local92 + 1, 301, 31);
			local63.fillRect(local85 + arg0 * 3 + 2, local92 + 2, 300 - arg0 * 3, 30);
			local158 = arg1 + " - " + arg0 + "%";
			local63.setFont(this.bf);
			local63.setColor(this.colourtext);
			local63.drawString(local158, (this.anInt10938 - this.bfm.stringWidth(local158)) / 2, this.anInt10939 / 2 + 4);
			local44.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(194) Exception local194) {
			local44.setColor(Color.black);
			local44.fillRect(0, 0, this.anInt10938, this.anInt10939);
			local44.setColor(this.aColor3);
			local85 = this.anInt10938 / 2 - 152;
			local92 = this.anInt10939 / 2 - 18;
			local44.drawRect(local85, local92, 303, 33);
			local44.setColor(this.aColor2);
			local44.fillRect(local85 + 2, local92 + 2, arg0 * 3, 30);
			local44.setColor(Color.black);
			local44.drawRect(local85 + 1, local92 + 1, 301, 31);
			local44.fillRect(local85 + arg0 * 3 + 2, local92 + 2, 300 - arg0 * 3, 30);
			local158 = arg1 + " - " + arg0 + "%";
			local44.setFont(this.bf);
			local44.setColor(this.colourtext);
			local44.drawString(local158, (this.anInt10938 - this.bfm.stringWidth(local158)) / 2, this.anInt10939 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean776 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!c;)[B")
	private byte[] method9251(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class400 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt10932];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(61) InputStream local61;
			if (arg0) {
				@Pc(24) URL local24 = this.getCodeBase();
				@Pc(32) Socket local32 = new Socket(InetAddress.getByName(local24.getHost()), 443);
				local32.setSoTimeout(10000);
				@Pc(38) OutputStream local38 = local32.getOutputStream();
				local38.write(17);
				local38.write(("JAGGRAB " + local24.getFile() + arg1.aString127 + "\n\n").getBytes());
				local61 = local32.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg1.aString127)).openStream();
			}
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = 0;
			@Pc(78) int local78 = 0;
			while (true) {
				if (local5.length <= local76) {
					local61.close();
					if (arg1.anInt10932 != arg1.anInt10931) {
						@Pc(194) byte[] local194 = new byte[arg1.anInt10931];
						@Pc(199) Inflater local199 = new Inflater(true);
						local199.setInput(local5);
						local5 = local194;
						local199.inflate(local194);
					}
					break;
				}
				@Pc(98) int local98 = local5.length - local76;
				if (local98 > 1000) {
					local98 = 1000;
				}
				@Pc(111) int local111 = local61.read(local5, local76, local98);
				if (local111 < 0) {
					throw new EOFException();
				}
				local76 += local111;
				@Pc(131) int local131 = local76 * 100 / local5.length;
				@Pc(133) int local133 = 0;
				if (this.lb != null && this.bar != null) {
					local133 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
				}
				if (local131 != local74 || local133 != local78) {
					try {
						if (this.method9244(arg1.aStringArray43[this.anInt10936], local131, local133)) {
							local74 = local131;
							local78 = local133;
						}
					} catch (@Pc(181) Exception local181) {
					}
				}
			}
		} catch (@Pc(210) Exception local210) {
			return null;
		}
		return this.method9248(local5, arg1) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!c;Z)[B")
	private byte[] method9252(@OriginalArg(0) Class400 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class399.method9232(arg0.aString126);
		} catch (@Pc(6) Exception local6) {
			this.method9241("nocache");
			return null;
		}
		@Pc(17) byte[] local17 = this.method9246(local4);
		if (!this.method9248(local17, arg0)) {
			local17 = this.method9251(false, arg0);
			if (local17 == null) {
				local17 = this.method9251(true, arg0);
			}
			if (local17 == null) {
				this.method9241("download");
				return null;
			}
			if (!this.method9247(local4, local17)) {
				return null;
			}
			local17 = this.method9246(local4);
			if (!this.method9248(local17, arg0)) {
				this.method9241("mismatch");
				return null;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method9253() {
		this.aColor2 = null;
		this.barBuf = null;
		this.anImage14 = null;
		this.aColor3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean776 = true;
		this.aBoolean775 = this.aBoolean773 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean775 = true;
		this.aBoolean773 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean775 = false;
		this.aBoolean773 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method9254(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10938, this.anInt10939);
			this.canvas.setVisible(true);
		}
		@Pc(39) Graphics local39 = this.canvas.getGraphics();
		if (local39 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10938, this.anInt10939);
			}
			@Pc(61) Graphics local61 = this.anImage14.getGraphics();
			@Pc(66) int local66 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(71) int local71 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(76) int local76 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(81) int local81 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(86) int local86 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(91) int local91 = this.bodyFill.getHeight((ImageObserver) null);
			local61.drawImage(this.bodyLeft, this.method9242(local66) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9245(local81) - -this.lb.boxYOffset, (ImageObserver) null);
			@Pc(134) int local134 = this.lb.boxXOffset + local66 - this.lb.boxWidth / 2;
			@Pc(145) int local145 = this.lb.boxXOffset + this.lb.boxWidth / 2;
			@Pc(147) int local147;
			for (local147 = local134; local147 <= local145; local147 += local76) {
				local61.drawImage(this.bodyFill, local147 + this.method9242(local66) + this.lb.boxXOffset, this.method9245(local91) - -this.lb.boxYOffset, (ImageObserver) null);
			}
			local61.drawImage(this.bodyRight, this.method9242(local71) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9245(local86) + this.lb.boxYOffset, (ImageObserver) null);
			local147 = this.left.getWidth((ImageObserver) null);
			@Pc(221) int local221 = this.left.getHeight((ImageObserver) null);
			@Pc(226) int local226 = this.right.getWidth((ImageObserver) null);
			@Pc(231) int local231 = this.right.getHeight((ImageObserver) null);
			@Pc(236) int local236 = this.bottom.getHeight((ImageObserver) null);
			@Pc(241) int local241 = this.top.getWidth((ImageObserver) null);
			@Pc(246) int local246 = this.top.getHeight((ImageObserver) null);
			@Pc(251) int local251 = this.bottom.getWidth((ImageObserver) null);
			@Pc(256) int local256 = this.bar.getWidth((ImageObserver) null);
			@Pc(261) int local261 = this.background.getWidth((ImageObserver) null);
			@Pc(272) int local272 = this.method9242(this.lb.width) + this.lb.xOffset;
			@Pc(284) int local284 = this.method9245(this.lb.height) + this.lb.yOffset;
			local61.drawImage(this.left, local272, (this.lb.height - local221) / 2 + local284, (ImageObserver) null);
			local61.drawImage(this.right, local272 + this.lb.width - local226, (-local231 + this.lb.height) / 2 + local284, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local147 - local226, this.lb.height);
			}
			@Pc(347) Graphics local347 = this.barBuf.getGraphics();
			@Pc(349) int local349;
			for (local349 = 0; local349 < this.lb.width - local226 - local147; local349 += local241) {
				local347.drawImage(this.top, local349, 0, (ImageObserver) null);
			}
			for (local349 = 0; local349 < this.lb.width - local147 - local226; local349 += local251) {
				local347.drawImage(this.bottom, local349, this.lb.height - local236, (ImageObserver) null);
			}
			local349 = arg1 * (this.lb.width - local226 - local147) / 100;
			if (local349 > 0) {
				@Pc(433) Image local433 = this.createImage(local349, this.lb.height - local236 - local246);
				@Pc(437) int local437 = local433.getWidth((ImageObserver) null);
				@Pc(440) Graphics local440 = local433.getGraphics();
				for (@Pc(445) int local445 = arg2 - local256; local445 < local437; local445 += local256) {
					local440.drawImage(this.bar, local445, 0, (ImageObserver) null);
				}
				local347.drawImage(local433, 0, local246, (ImageObserver) null);
			}
			@Pc(471) int local471 = local349;
			local349 = this.lb.width - local226 - local147 - local349;
			if (local349 > 0) {
				@Pc(503) Image local503 = this.createImage(local349, this.lb.height - local236 - local246);
				@Pc(507) int local507 = local503.getWidth((ImageObserver) null);
				@Pc(510) Graphics local510 = local503.getGraphics();
				for (@Pc(512) int local512 = 0; local512 < local507; local512 += local261) {
					local510.drawImage(this.background, local512, 0, (ImageObserver) null);
				}
				local347.drawImage(local503, local471, local246, (ImageObserver) null);
			}
			local61.drawImage(this.barBuf, local272 + local147, local284, (ImageObserver) null);
			local61.setFont(this.bf);
			local61.setColor(this.colourtext);
			@Pc(567) String local567 = arg0 + " - " + arg1 + "%";
			local61.drawString(local567, (this.lb.width - this.bfm.stringWidth(local567)) / 2 + local272, this.lb.textYOffset + 4 + this.lb.height / 2 + local284);
			local39.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(605) Exception local605) {
			this.method9249();
		}
		return true;
	}
}
