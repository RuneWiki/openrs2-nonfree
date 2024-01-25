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

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString126;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString127;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "I")
	private static int anInt10395 = 0;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!f;")
	private Class383 lb;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt10392;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt10393;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage18;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean757;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean753 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt10394 = 0;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean754 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean756 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean755 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!d;I)[B")
	private byte[] method8669(@OriginalArg(0) Class382 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class384.method8667(arg0.aString112);
		} catch (@Pc(13) Exception local13) {
			this.method8673("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method8681(local4);
		if (!this.method8678(local24, arg0)) {
			local24 = this.method8677(arg0, false);
			if (local24 == null) {
				local24 = this.method8677(arg0, true);
			}
			if (local24 == null) {
				this.method8673("download");
				return null;
			}
			if (!this.method8670(local4, local24)) {
				return null;
			}
			local24 = this.method8681(local4);
			if (!this.method8678(local24, arg0)) {
				this.method8673("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BB)Z")
	private boolean method8670(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method8673("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8671() {
		this.aBoolean757 = true;
		this.bf = null;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean754 = false;
		this.aBoolean753 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method8672() {
		this.anImage18 = null;
		this.aColor3 = null;
		this.aColor2 = null;
		this.barBuf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method8673(@OriginalArg(1) String arg0) {
		if (this.aBoolean755) {
			return;
		}
		this.aBoolean755 = true;
		try {
			if (aString126 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString126 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method8674(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(17) int local17 = 0;
			@Pc(22) int local22;
			while ((local22 = local6.read()) != -1) {
				local9[local17++] = (byte) local22;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(38) Exception local38) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;IZ)Z")
	private boolean method8675(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return Class381.aClass383Array1[anInt10395] == null || this.aBoolean757 ? this.method8682(arg1, arg0) : this.method8676(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;II)Z")
	private boolean method8676(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10393, this.anInt10392);
			this.canvas.setVisible(true);
		}
		@Pc(37) Graphics local37 = this.canvas.getGraphics();
		if (local37 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage18 == null) {
				this.anImage18 = this.createImage(this.anInt10393, this.anInt10392);
			}
			@Pc(59) Graphics local59 = this.anImage18.getGraphics();
			@Pc(64) int local64 = this.bodyLeft.getWidth(null);
			@Pc(69) int local69 = this.bodyRight.getWidth(null);
			@Pc(74) int local74 = this.bodyFill.getWidth(null);
			@Pc(79) int local79 = this.bodyLeft.getHeight(null);
			@Pc(84) int local84 = this.bodyRight.getHeight(null);
			@Pc(89) int local89 = this.bodyFill.getHeight(null);
			local59.drawImage(this.bodyLeft, this.method8679(local64) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8680(local79) - -this.lb.boxYOffset, null);
			@Pc(134) int local134 = this.lb.boxXOffset + local64 - this.lb.boxWidth / 2;
			@Pc(144) int local144 = this.lb.boxXOffset + this.lb.boxWidth / 2;
			@Pc(146) int local146;
			for (local146 = local134; local146 <= local144; local146 += local74) {
				local59.drawImage(this.bodyFill, local146 + this.method8679(local64) + this.lb.boxXOffset, this.method8680(local89) + this.lb.boxYOffset, null);
			}
			local59.drawImage(this.bodyRight, this.method8679(local69) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8680(local84) - -this.lb.boxYOffset, null);
			local146 = this.left.getWidth(null);
			@Pc(220) int local220 = this.left.getHeight(null);
			@Pc(225) int local225 = this.right.getWidth(null);
			@Pc(230) int local230 = this.right.getHeight(null);
			@Pc(235) int local235 = this.bottom.getHeight(null);
			@Pc(240) int local240 = this.top.getWidth(null);
			@Pc(245) int local245 = this.top.getHeight(null);
			@Pc(250) int local250 = this.bottom.getWidth(null);
			@Pc(255) int local255 = this.bar.getWidth(null);
			@Pc(260) int local260 = this.background.getWidth(null);
			@Pc(272) int local272 = this.method8679(this.lb.width) + this.lb.xOffset;
			@Pc(284) int local284 = this.method8680(this.lb.height) + this.lb.yOffset;
			local59.drawImage(this.left, local272, (this.lb.height - local220) / 2 + local284, null);
			local59.drawImage(this.right, local272 + this.lb.width - local225, (this.lb.height + -local230) / 2 + local284, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local225 - local146, this.lb.height);
			}
			@Pc(347) Graphics local347 = this.barBuf.getGraphics();
			@Pc(349) int local349;
			for (local349 = 0; local349 < this.lb.width - local146 - local225; local349 += local240) {
				local347.drawImage(this.top, local349, 0, null);
			}
			for (local349 = 0; local349 < this.lb.width - local146 - local225; local349 += local250) {
				local347.drawImage(this.bottom, local349, this.lb.height - local235, null);
			}
			local349 = arg0 * (this.lb.width - local146 - local225) / 100;
			if (local349 > 0) {
				@Pc(437) Image local437 = this.createImage(local349, this.lb.height - local235 - local245);
				@Pc(441) int local441 = local437.getWidth(null);
				@Pc(444) Graphics local444 = local437.getGraphics();
				for (@Pc(449) int local449 = arg2 - local255; local449 < local441; local449 += local255) {
					local444.drawImage(this.bar, local449, 0, null);
				}
				local347.drawImage(local437, 0, local245, null);
			}
			@Pc(475) int local475 = local349;
			local349 = this.lb.width - local146 - local225 - local349;
			if (local349 > 0) {
				@Pc(506) Image local506 = this.createImage(local349, this.lb.height - local235 - local245);
				@Pc(510) int local510 = local506.getWidth(null);
				@Pc(513) Graphics local513 = local506.getGraphics();
				for (@Pc(515) int local515 = 0; local515 < local510; local515 += local260) {
					local513.drawImage(this.background, local515, 0, null);
				}
				local347.drawImage(local506, local475, local245, null);
			}
			local59.drawImage(this.barBuf, local272 + local146, local284, null);
			local59.setFont(this.bf);
			local59.setColor(this.colourtext);
			@Pc(570) String local570 = arg1 + " - " + arg0 + "%";
			local59.drawString(local570, local272 + (this.lb.width - this.bfm.stringWidth(local570)) / 2, local284 - -(this.lb.height / 2) + 4 - -this.lb.textYOffset);
			local37.drawImage(this.anImage18, 0, 0, null);
		} catch (@Pc(610) Exception local610) {
			this.method8671();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!d;IZ)[B")
	private byte[] method8677(@OriginalArg(0) Class382 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10387];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(31) InputStream local31;
			if (arg1) {
				@Pc(36) URL local36 = this.getCodeBase();
				@Pc(44) Socket local44 = new Socket(InetAddress.getByName(local36.getHost()), 443);
				local44.setSoTimeout(10000);
				@Pc(50) OutputStream local50 = local44.getOutputStream();
				local50.write(17);
				local50.write(("JAGGRAB " + local36.getFile() + arg0.aString111 + "\n\n").getBytes());
				local31 = local44.getInputStream();
			} else {
				local31 = (new URL(this.getCodeBase(), arg0.aString111)).openStream();
			}
			@Pc(83) int local83 = -1;
			@Pc(85) int local85 = 0;
			@Pc(87) int local87 = 0;
			while (true) {
				if (local5.length <= local85) {
					local31.close();
					if (arg0.anInt10386 != arg0.anInt10387) {
						@Pc(196) byte[] local196 = new byte[arg0.anInt10386];
						@Pc(201) Inflater local201 = new Inflater(true);
						local201.setInput(local5);
						local5 = local196;
						local201.inflate(local196);
					}
					break;
				}
				@Pc(101) int local101 = local5.length - local85;
				if (local101 > 1000) {
					local101 = 1000;
				}
				@Pc(115) int local115 = local31.read(local5, local85, local101);
				if (local115 < 0) {
					throw new EOFException();
				}
				local85 += local115;
				@Pc(132) int local132 = local85 * 100 / local5.length;
				@Pc(134) int local134 = 0;
				if (this.lb != null && this.bar != null) {
					local134 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
				}
				if (local132 != local83 || local87 != local134) {
					try {
						if (this.method8675(local132, arg0.aStringArray50[this.anInt10394], local134)) {
							local87 = local134;
							local83 = local132;
						}
					} catch (@Pc(179) Exception local179) {
					}
				}
			}
		} catch (@Pc(212) Exception local212) {
			return null;
		}
		return this.method8678(local5, arg0) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!d;I)Z")
	private boolean method8678(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class382 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(15) MessageDigest local15 = MessageDigest.getInstance("SHA");
			local15.reset();
			local15.update(arg0);
			@Pc(23) byte[] local23 = local15.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (local23[local25] != arg1.anIntArray702[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(48) Exception local48) {
			this.method8673("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean756 = false;
		this.setBackground(Color.black);
		@Pc(20) Thread local20 = new Thread(this);
		local20.start();
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean754 = true;
		this.aBoolean753 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean756 = true;
		this.aBoolean753 = this.aBoolean754 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString127 = this.getParameter("unsignedurl");
			if (aString127 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean755 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString127), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString126 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class381.aStringArray49.length) {
					local37 = 0;
				}
			}
			@Pc(61) String local61 = this.getParameter("colourid");
			if (local61 != null) {
				anInt10395 = Integer.parseInt(local61);
				if (anInt10395 < 0 || anInt10395 >= Class381.anIntArray700.length) {
					anInt10395 = 0;
				}
			}
			this.lb = Class381.aClass383Array1[anInt10395];
			this.anInt10393 = this.getSize().width;
			this.anInt10392 = this.getSize().height;
			@Pc(96) int local96 = 32;
			try {
				@Pc(101) int local101 = Integer.parseInt(this.getParameter("modewhat"));
				local96 += local101;
			} catch (@Pc(107) Exception local107) {
			}
			try {
				@Pc(111) String local111 = this.getParameter("lang");
				if (local111 != null) {
					this.anInt10394 = Integer.parseInt(local111);
				}
			} catch (@Pc(120) Exception local120) {
			}
			Class384.method8666(Class381.aStringArray49[local37], local96);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString119, 0, this.lb.anInt10388);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10389);
					this.bar = this.method8674(this.lb.aString116);
					this.background = this.method8674(this.lb.aString121);
					this.left = this.method8674(this.lb.aString122);
					this.right = this.method8674(this.lb.aString120);
					this.top = this.method8674(this.lb.aString114);
					this.bottom = this.method8674(this.lb.aString113);
					this.bodyLeft = this.method8674(this.lb.aString117);
					this.bodyRight = this.method8674(this.lb.aString115);
					this.bodyFill = this.method8674(this.lb.aString118);
					@Pc(277) Image[] local277 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(282) MediaTracker local282 = new MediaTracker(this);
					for (@Pc(284) int local284 = 0; local284 < local277.length; local284++) {
						local282.addImage(local277[local284], local284);
					}
					while (true) {
						try {
							local282.waitForAll();
							break;
						} catch (@Pc(305) InterruptedException local305) {
						}
					}
				} catch (@Pc(309) Throwable local309) {
					this.method8671();
				}
			}
			@Pc(314) unpack local314 = null;
			@Pc(322) byte[] local322;
			try {
				Class.forName("java.util.jar.Pack200");
				local322 = this.method8669(Class381.aClass382_2);
				if (local322 == null) {
					return;
				}
				local314 = new unpack_Sub1(local322);
			} catch (@Pc(333) Throwable local333) {
			}
			if (local314 == null) {
				local322 = this.method8669(Class381.aClass382_1);
				if (local322 == null) {
					return;
				}
				@Pc(350) unpack local350 = new unpack(local322);
				@Pc(355) ClassLoader_Sub1 local355 = new ClassLoader_Sub1(local350);
				@Pc(358) Class local358 = Class.forName("unpack");
				local355.method8657(local358.getName(), local358);
				@Pc(368) Class local368 = local355.loadClass("unpackclass");
				@Pc(373) byte[] local373 = this.method8669(Class381.aClass382_3);
				if (local373 == null) {
					return;
				}
				local314 = (unpack) local368.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local373, Boolean.TRUE);
			}
			@Pc(407) ClassLoader_Sub1 local407 = new ClassLoader_Sub1(local314);
			@Pc(410) Class local410 = Class.forName("Class384");
			local407.method8657(local410.getName(), local410);
			@Pc(420) Class local420 = local407.loadClass("client");
			synchronized (this) {
				if (this.aBoolean756) {
					return;
				}
				this.anApplet3 = (Applet) local420.getDeclaredConstructor().newInstance();
				local420.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean753) {
					this.anApplet3.start();
				}
				if (this.aBoolean754) {
					this.anApplet3.stop();
				}
			}
			this.method8672();
		} catch (@Pc(490) Exception local490) {
			RuntimeException_Sub2.anInt10390 = 1910083802;
			if (local490 instanceof InvocationTargetException) {
				@Pc(499) Throwable local499 = ((InvocationTargetException) local490).getTargetException();
				if (local499 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8662(local490.toString(), local499, this);
			} else {
				RuntimeException_Sub2.method8662(null, local490, this);
			}
			this.method8673("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method8679(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt10393 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IB)I")
	private int method8680(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt10392 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method8681(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(23) byte[] local23 = new byte[local9];
			local20.readFully(local23, 0, local9);
			local20.close();
			return local23;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IB)Z")
	private boolean method8682(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class381.anIntArray700[anInt10395]);
			this.aColor2 = new Color(Class381.anIntArray699[anInt10395]);
			this.colourtext = new Color(Class381.anIntArray701[anInt10395]);
		}
		@Pc(53) Graphics local53 = this.getGraphics();
		if (local53 == null) {
			this.repaint();
			return false;
		}
		@Pc(98) int local98;
		@Pc(105) int local105;
		@Pc(172) String local172;
		try {
			if (this.anImage18 == null) {
				this.anImage18 = this.createImage(this.anInt10393, this.anInt10392);
			}
			@Pc(76) Graphics local76 = this.anImage18.getGraphics();
			local76.setColor(Color.black);
			local76.fillRect(0, 0, this.anInt10393, this.anInt10392);
			local76.setColor(this.aColor3);
			local98 = this.anInt10393 / 2 - 152;
			local105 = this.anInt10392 / 2 - 18;
			local76.drawRect(local98, local105, 303, 33);
			local76.setColor(this.aColor2);
			local76.fillRect(local98 + 2, local105 + 2, arg1 * 3, 30);
			local76.setColor(Color.black);
			local76.drawRect(local98 + 1, local105 + 1, 301, 31);
			local76.fillRect(arg1 * 3 + local98 + 2, local105 + 2, 300 - arg1 * 3, 30);
			local172 = arg0 + " - " + arg1 + "%";
			local76.setFont(this.bf);
			local76.setColor(this.colourtext);
			local76.drawString(local172, (this.anInt10393 - this.bfm.stringWidth(local172)) / 2, this.anInt10392 / 2 + 4);
			local53.drawImage(this.anImage18, 0, 0, null);
		} catch (@Pc(209) Exception local209) {
			local53.setColor(Color.black);
			local53.fillRect(0, 0, this.anInt10393, this.anInt10392);
			local53.setColor(this.aColor3);
			local98 = this.anInt10393 / 2 - 152;
			local105 = this.anInt10392 / 2 - 18;
			local53.drawRect(local98, local105, 303, 33);
			local53.setColor(this.aColor2);
			local53.fillRect(local98 + 2, local105 - -2, arg1 * 3, 30);
			local53.setColor(Color.black);
			local53.drawRect(local98 + 1, local105 + 1, 301, 31);
			local53.fillRect(local98 + arg1 * 3 + 2, local105 + 2, 300 - arg1 * 3, 30);
			local172 = arg0 + " - " + arg1 + "%";
			local53.setFont(this.bf);
			local53.setColor(this.colourtext);
			local53.drawString(local172, (this.anInt10393 - this.bfm.stringWidth(local172)) / 2, this.anInt10392 / 2 + 4);
		}
		return true;
	}
}
