import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!tk")
public final class Class211 implements Runnable {

	@OriginalMember(owner = "loader!tk", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString201;

	@OriginalMember(owner = "loader!tk", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString202;

	@OriginalMember(owner = "loader!tk", name = "u", descriptor = "Ljava/lang/String;")
	private static String aString203;

	@OriginalMember(owner = "loader!tk", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString205;

	@OriginalMember(owner = "loader!tk", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString206;

	@OriginalMember(owner = "loader!tk", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString207;

	@OriginalMember(owner = "loader!tk", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString208;

	@OriginalMember(owner = "loader!tk", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod7;

	@OriginalMember(owner = "loader!tk", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod8;

	@OriginalMember(owner = "loader!tk", name = "j", descriptor = "I")
	private static int anInt5581 = 1;

	@OriginalMember(owner = "loader!tk", name = "l", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!tk", name = "t", descriptor = "J")
	private static volatile long aLong1325 = 0L;

	@OriginalMember(owner = "loader!tk", name = "A", descriptor = "Lloader!nl;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "loader!tk", name = "h", descriptor = "Z")
	private boolean aBoolean383 = false;

	@OriginalMember(owner = "loader!tk", name = "o", descriptor = "Lloader!fk;")
	private Class208 aClass208_1 = null;

	@OriginalMember(owner = "loader!tk", name = "r", descriptor = "Lloader!fk;")
	private Class208 aClass208_3 = null;

	@OriginalMember(owner = "loader!tk", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!tk", name = "z", descriptor = "Lloader!oh;")
	private Class210 aClass210_3 = null;

	@OriginalMember(owner = "loader!tk", name = "a", descriptor = "Lloader!fk;")
	private Class208 aClass208_2 = null;

	@OriginalMember(owner = "loader!tk", name = "c", descriptor = "Lloader!oh;")
	private Class210 aClass210_2 = null;

	@OriginalMember(owner = "loader!tk", name = "x", descriptor = "Ljava/lang/String;")
	private String aString204;

	@OriginalMember(owner = "loader!tk", name = "p", descriptor = "I")
	private int anInt5580;

	@OriginalMember(owner = "loader!tk", name = "m", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!tk", name = "s", descriptor = "[Lloader!fk;")
	private Class208[] aClass208Array1;

	@OriginalMember(owner = "loader!tk", name = "e", descriptor = "Lloader!c;")
	private Class205 aClass205_1;

	@OriginalMember(owner = "loader!tk", name = "w", descriptor = "Lloader!f;")
	private Class207 aClass207_1;

	@OriginalMember(owner = "loader!tk", name = "y", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!tk", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!fk;")
	private static Class208 method4743(@OriginalArg(0) String arg0) {
		@Pc(42) String[] local42 = new String[] { "c:/rscache/", "/rscache/", aString203, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
			@Pc(52) String local52 = local42[local44];
			if (local52.length() <= 0 || (new File(local52)).exists()) {
				try {
					return new Class208(new File(local52, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(86) Exception local86) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!tk", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)Ljava/io/File;")
	public static File method4747(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(42) String[] local42 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString203, "/tmp/", "" };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(84) int local84 = 0; local84 < local42.length; local84++) {
				for (@Pc(94) int local94 = 0; local94 < local77.length; local94++) {
					@Pc(128) String local128 = local77[local94] + local42[local84] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(130) RandomAccessFile local130 = null;
					try {
						@Pc(135) File local135 = new File(local128);
						if (local79 != 0 || local135.exists()) {
							@Pc(147) String local147 = local77[local94];
							if (local79 != 1 || local147.length() <= 0 || (new File(local147)).exists()) {
								(new File(local77[local94] + local42[local84])).mkdir();
								if (arg2 != null) {
									(new File(local77[local94] + local42[local84] + "/" + arg2)).mkdir();
								}
								local130 = new RandomAccessFile(local135, "rw");
								@Pc(211) int local211 = local130.read();
								local130.seek(0L);
								local130.write(local211);
								local130.seek(0L);
								local130.close();
								aHashtable2.put(arg1, local135);
								return local135;
							}
						}
					} catch (@Pc(230) Exception local230) {
						try {
							if (local130 != null) {
								local130.close();
							}
						} catch (@Pc(239) Exception local239) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!tk", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class211(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString204 = arg2;
		this.anInt5580 = arg1;
		this.anApplet3 = arg0;
		aString207 = "1.1";
		aString208 = "Unknown";
		try {
			aString208 = System.getProperty("java.vendor");
			aString207 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString202 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString202 = "Unknown";
		}
		aString205 = aString202.toLowerCase();
		try {
			aString201 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString201 = "";
		}
		try {
			aString206 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString206 = "";
		}
		try {
			aString203 = System.getProperty("user.home");
			if (aString203 != null) {
				aString203 = aString203 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString203 == null) {
			aString203 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
		}
		try {
			if (arg0 == null) {
				aMethod8 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod8 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg0 == null) {
				aMethod7 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod7 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass208_2 = new Class208(method4747(this.anInt5580, "random.dat", null), "rw", 25L);
		this.aClass208_3 = new Class208(method4747(this.anInt5580, "main_file_cache.dat2", this.aString204), "rw", 104857600L);
		this.aClass208_1 = new Class208(method4747(this.anInt5580, "main_file_cache.idx255", this.aString204), "rw", 1048576L);
		this.aClass208Array1 = new Class208[arg3];
		for (@Pc(199) int local199 = 0; local199 < arg3; local199++) {
			this.aClass208Array1[local199] = new Class208(method4747(this.anInt5580, "main_file_cache.idx" + local199, this.aString204), "rw", 1048576L);
		}
		try {
			this.aClass205_1 = new Class205();
		} catch (@Pc(234) Throwable local234) {
		}
		try {
			this.aClass207_1 = new Class207();
		} catch (@Pc(241) Throwable local241) {
		}
		@Pc(244) ThreadGroup local244 = Thread.currentThread().getThreadGroup();
		for (@Pc(247) ThreadGroup local247 = local244.getParent(); local247 != null; local247 = local247.getParent()) {
			local244 = local247;
		}
		@Pc(258) Thread[] local258 = new Thread[1000];
		local244.enumerate(local258);
		for (@Pc(264) int local264 = 0; local264 < local258.length; local264++) {
			if (local258[local264] != null && local258[local264].getName().startsWith("AWT")) {
				local258[local264].setPriority(1);
			}
		}
		this.aBoolean383 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!tk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class210 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean383) {
						return;
					}
					if (this.aClass210_2 != null) {
						local18 = this.aClass210_2;
						this.aClass210_2 = this.aClass210_2.aClass210_1;
						if (this.aClass210_2 == null) {
							this.aClass210_3 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(35) InterruptedException local35) {
					}
				}
			}
			try {
				@Pc(47) int local47 = local18.anInt5579;
				if (local47 == 1) {
					if (Class209.method4724() < aLong1325) {
						throw new IOException();
					}
					local18.anObject8 = new Socket(InetAddress.getByName((String) local18.anObject9), local18.anInt5576);
				} else if (local47 == 2) {
					@Pc(60) Thread local60 = new Thread((Runnable) local18.anObject9);
					local60.setDaemon(true);
					local60.start();
					local60.setPriority(local18.anInt5576);
					local18.anObject8 = local60;
				} else if (local47 == 4) {
					if (Class209.method4724() < aLong1325) {
						throw new IOException();
					}
					local18.anObject8 = new DataInputStream(((URL) local18.anObject9).openStream());
				} else {
					@Pc(87) Object[] local87;
					if (local47 == 8) {
						local87 = (Object[]) local18.anObject9;
						if (((Class) local87[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject8 = ((Class) local87[0]).getDeclaredMethod((String) local87[1], (Class[]) local87[2]);
					} else if (local47 == 9) {
						local87 = (Object[]) local18.anObject9;
						if (((Class) local87[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject8 = ((Class) local87[0]).getDeclaredField((String) local87[1]);
					} else {
						@Pc(162) String local162;
						if (local47 == 3) {
							if (Class209.method4724() < aLong1325) {
								throw new IOException();
							}
							local162 = (local18.anInt5576 >> 24 & 0xFF) + "." + (local18.anInt5576 >> 16 & 0xFF) + "." + (local18.anInt5576 >> 8 & 0xFF) + "." + (local18.anInt5576 & 0xFF);
							local18.anObject8 = InetAddress.getByName(local162).getHostName();
						} else if (local47 == 5) {
							local18.anObject8 = this.aClass205_1.method4708();
						} else if (local47 == 6) {
							@Pc(190) Frame local190 = new Frame("Jagex Full Screen");
							local18.anObject8 = local190;
							local190.setResizable(false);
							this.aClass205_1.method4709(local18.anInt5578 & 0xFFFF, local18.anInt5576 & 0xFFFF, local18.anInt5576 >>> 16, local190, local18.anInt5578 >> 16);
						} else if (local47 == 7) {
							this.aClass205_1.method4710();
						} else if (local47 == 10) {
							@Pc(480) Class[] local480 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
							@Pc(482) Runtime local482 = Runtime.getRuntime();
							@Pc(492) Method local492;
							if (!aString205.startsWith("mac")) {
								local492 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local480);
								local492.setAccessible(true);
								local492.invoke(local482, local18.anObject9, "jawt");
								local492.setAccessible(false);
							}
							local492 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local480);
							local492.setAccessible(true);
							if (aString205.startsWith("linux") || aString205.startsWith("sunos")) {
								local492.invoke(local482, local18.anObject9, method4747(this.anInt5580, "libgluegen-rt.so", this.aString204).toString());
								@Pc(559) Class local559 = ((Class) local18.anObject9).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
								local559.getMethod("begin").invoke(null);
								local492.invoke(local482, local18.anObject9, method4747(this.anInt5580, "libjogl.so", this.aString204).toString());
								local559.getMethod("end").invoke(null);
								local492.invoke(local482, local18.anObject9, method4747(this.anInt5580, "libjogl_awt.so", this.aString204).toString());
							} else if (aString205.startsWith("mac")) {
								local492.invoke(local482, local18.anObject9, method4747(this.anInt5580, "libjogl.jnilib", this.aString204).toString());
								local492.invoke(local482, local18.anObject9, method4747(this.anInt5580, "libjogl_awt.jnilib", this.aString204).toString());
							} else if (aString205.startsWith("win")) {
								local492.invoke(local482, local18.anObject9, method4747(this.anInt5580, "jogl.dll", this.aString204).toString());
								local492.invoke(local482, local18.anObject9, method4747(this.anInt5580, "jogl_awt.dll", this.aString204).toString());
							} else {
								throw new Exception();
							}
							local492.setAccessible(false);
						} else {
							@Pc(293) int local293;
							if (local47 == 11) {
								@Pc(403) Field local403 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local403.setAccessible(true);
								@Pc(414) Vector local414 = (Vector) local403.get(((Class) local18.anObject9).getClassLoader());
								for (local293 = 0; local293 < local414.size(); local293++) {
									@Pc(424) Object local424 = local414.elementAt(local293);
									@Pc(431) Method local431 = local424.getClass().getDeclaredMethod("finalize");
									local431.setAccessible(true);
									local431.invoke(local424);
									local431.setAccessible(false);
									@Pc(448) Field local448 = local424.getClass().getDeclaredField("handle");
									local448.setAccessible(true);
									local448.set(local424, Integer.valueOf(0));
									local448.setAccessible(false);
								}
								local403.setAccessible(false);
							} else if (local47 == 12) {
								local162 = (String) local18.anObject9;
								@Pc(242) Class208 local242 = method4743(local162);
								local18.anObject8 = local242;
							} else if (local47 == 14) {
								@Pc(388) int local388 = local18.anInt5578;
								@Pc(391) int local391 = local18.anInt5576;
								this.aClass207_1.method4714(local388, local391);
							} else if (local47 == 15) {
								@Pc(374) boolean local374 = local18.anInt5576 != 0;
								@Pc(378) Component local378 = (Component) local18.anObject9;
								this.aClass207_1.method4713(local374, local378);
							} else if (local47 == 17) {
								local87 = (Object[]) local18.anObject9;
								this.aClass207_1.method4712(local18.anInt5578, (Component) local87[0], local18.anInt5576, (Point) local87[2], (int[]) local87[1]);
							} else if (local47 == 16) {
								try {
									if (!aString205.startsWith("win")) {
										throw new Exception();
									}
									local162 = (String) local18.anObject9;
									if (!local162.startsWith("http://") && !local162.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(291) String local291 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local293 = 0; local162.length() > local293; local293++) {
										if (local291.indexOf(local162.charAt(local293)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local162 + "\"");
									local18.anObject8 = null;
								} catch (@Pc(332) Exception local332) {
									local18.anObject8 = local332;
								}
							} else {
								throw new Exception();
							}
						}
					}
				}
				local18.anInt5577 = 1;
			} catch (@Pc(813) ThreadDeath local813) {
				throw local813;
			} catch (@Pc(816) Throwable local816) {
				local18.anInt5577 = 2;
			}
		}
	}
}
