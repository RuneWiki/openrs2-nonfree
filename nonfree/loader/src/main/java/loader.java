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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString89;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString90;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private static int anInt9489 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt9488;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt9491;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean657 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt9490 = 0;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean658 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean660 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean659 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!f;I)[B")
	private byte[] method8021(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class325 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local8);
		@Pc(25) Color local25 = new Color(Class324.anIntArray823[anInt9489]);
		@Pc(32) Color local32 = new Color(Class324.anIntArray824[anInt9489]);
		@Pc(36) byte[] local36 = new byte[arg1.anInt9484];
		try {
			@Pc(78) InputStream local78;
			if (arg0) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg1.aString87 + "\n\n").getBytes());
				local78 = local49.getInputStream();
			} else {
				local78 = (new URL(this.getCodeBase(), arg1.aString87)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local36.length > local93) {
				@Pc(107) int local107 = local36.length - local93;
				if (local107 > 1000) {
					local107 = 1000;
				}
				@Pc(120) int local120 = local78.read(local36, local93, local107);
				if (local120 < 0) {
					throw new EOFException();
				}
				local93 += local120;
				@Pc(139) int local139 = local93 * 100 / local36.length;
				if (local139 != local91) {
					try {
						@Pc(145) Graphics local145 = this.getGraphics();
						if (local145 == null) {
							this.repaint();
						} else {
							local145.setColor(Color.black);
							local145.fillRect(0, 0, this.anInt9488, this.anInt9491);
							local145.setColor(local25);
							local145.drawRect(this.anInt9488 / 2 - 152, this.anInt9491 / 2 + -18, 303, 33);
							@Pc(198) String local198 = arg1.aStringArray49[this.anInt9490] + " - " + local139 + "%";
							local145.setFont(local8);
							local145.setColor(local32);
							local91 = local139;
							local145.drawString(local198, (this.anInt9488 - local18.stringWidth(local198)) / 2, this.anInt9491 / 2 + 4);
						}
					} catch (@Pc(226) Exception local226) {
					}
				}
			}
			local78.close();
			if (arg1.anInt9484 != arg1.anInt9485) {
				@Pc(244) byte[] local244 = new byte[arg1.anInt9485];
				@Pc(249) Inflater local249 = new Inflater(true);
				local249.setInput(local36);
				local249.inflate(local244);
				local36 = local244;
			}
		} catch (@Pc(260) Exception local260) {
			return null;
		}
		return this.method8026(arg1, local36) ? local36 : null;
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
		this.aBoolean659 = false;
		this.aBoolean660 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!lp;Lloader!f;B)[B")
	private byte[] method8022(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class325 arg1) {
		@Pc(5) File local5;
		try {
			local5 = arg0.method8055(arg1.aString86, 0);
		} catch (@Pc(7) Exception local7) {
			this.method8023("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method8024(local5);
		if (!this.method8026(arg1, local26)) {
			local26 = this.method8021(false, arg1);
			if (local26 == null) {
				local26 = this.method8021(true, arg1);
			}
			if (local26 == null) {
				this.method8023("download");
				return null;
			}
			if (!this.method8025(local26, local5)) {
				return null;
			}
			local26 = this.method8024(local5);
			if (!this.method8026(arg1, local26)) {
				this.method8023("mismatch");
				return null;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean659 = this.aBoolean660 = false;
		this.aBoolean658 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method8023(@OriginalArg(0) String arg0) {
		if (this.aBoolean657) {
			return;
		}
		this.aBoolean657 = true;
		try {
			if (aString89 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString89 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method8024(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString90 = this.getParameter("unsignedurl");
			if (aString90 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean657 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString90), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString89 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class324.aStringArray48.length) {
					local37 = 0;
				}
			}
			@Pc(61) String local61 = this.getParameter("colourid");
			if (local61 != null) {
				anInt9489 = Integer.parseInt(local61);
				if (anInt9489 < 0 || Class324.anIntArray823.length <= anInt9489) {
					anInt9489 = 0;
				}
			}
			this.anInt9488 = this.getSize().width;
			this.anInt9491 = this.getSize().height;
			@Pc(93) int local93 = 32;
			try {
				@Pc(98) int local98 = Integer.parseInt(this.getParameter("modewhat"));
				local93 += local98;
			} catch (@Pc(104) Exception local104) {
			}
			try {
				@Pc(108) String local108 = this.getParameter("lang");
				if (local108 != null) {
					this.anInt9490 = Integer.parseInt(local108);
				}
			} catch (@Pc(116) Exception local116) {
			}
			@Pc(126) Class327 local126;
			try {
				local126 = new Class327(this, local93, Class324.aStringArray48[local37], 32);
			} catch (@Pc(128) Exception local128) {
				this.method8023("nocache");
				return;
			}
			@Pc(135) unpack local135 = null;
			@Pc(144) byte[] local144;
			try {
				Class.forName("java.util.jar.Pack200");
				local144 = this.method8022(local126, Class324.aClass325_2);
				if (local144 == null) {
					return;
				}
				local135 = new unpack_Sub1(local144);
			} catch (@Pc(154) Throwable local154) {
			}
			if (local135 == null) {
				local144 = this.method8022(local126, Class324.aClass325_1);
				if (local144 == null) {
					return;
				}
				@Pc(172) unpack local172 = new unpack(local144);
				@Pc(177) ClassLoader_Sub1 local177 = new ClassLoader_Sub1(local172);
				@Pc(180) Class local180 = Class.forName("unpack");
				local177.method7996(local180.getName(), local180);
				@Pc(190) Class local190 = local177.loadClass("unpackclass");
				@Pc(196) byte[] local196 = this.method8022(local126, Class324.aClass325_3);
				if (local196 == null) {
					return;
				}
				local135 = (unpack) local190.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local196, Boolean.TRUE);
			}
			@Pc(231) ClassLoader_Sub1 local231 = new ClassLoader_Sub1(local135);
			@Pc(234) Class local234 = Class.forName("Class326");
			local231.method7996(local234.getName(), local234);
			@Pc(243) Class local243 = Class.forName("Class327");
			local231.method7996(local243.getName(), local243);
			@Pc(252) Class local252 = Class.forName("Class328");
			local231.method7996(local252.getName(), local252);
			@Pc(261) Class local261 = Class.forName("Class323");
			local231.method7996(local261.getName(), local261);
			@Pc(270) Class local270 = Class.forName("Interface22");
			local231.method7996(local270.getName(), local270);
			@Pc(280) Class local280 = local231.loadClass("client");
			synchronized (this) {
				if (this.aBoolean658) {
					return;
				}
				this.anApplet2 = (Applet) local280.getDeclaredConstructor().newInstance();
				local280.getMethod("providesignlink", local243).invoke(null, local126);
				this.anApplet2.init();
				if (this.aBoolean659) {
					this.anApplet2.start();
				}
				if (this.aBoolean660) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(340) Exception local340) {
			RuntimeException_Sub2.anInt9486 = -487395407;
			if (local340 instanceof InvocationTargetException) {
				@Pc(349) Throwable local349 = ((InvocationTargetException) local340).getTargetException();
				if (local349 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8005(this, local340.toString(), local349);
			} else {
				RuntimeException_Sub2.method8005(this, null, local340);
			}
			this.method8023("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean659 = true;
		this.aBoolean660 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;Z)Z")
	private boolean method8025(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(8) FileOutputStream local8 = new FileOutputStream(arg1);
			local8.write(arg0, 0, arg0.length);
			local8.close();
			return true;
		} catch (@Pc(19) IOException local19) {
			this.method8023("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!f;[B)Z")
	private boolean method8026(@OriginalArg(1) Class325 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(16) MessageDigest local16 = MessageDigest.getInstance("SHA");
			local16.reset();
			local16.update(arg1);
			@Pc(24) byte[] local24 = local16.digest();
			for (@Pc(26) int local26 = 0; local26 < 20; local26++) {
				if (local24[local26] != arg0.anIntArray825[local26]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(44) Exception local44) {
			this.method8023("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean658 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}
}
