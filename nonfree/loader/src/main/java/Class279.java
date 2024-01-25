import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
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

@OriginalClass("loader!pb")
public final class Class279 implements Runnable {

	@OriginalMember(owner = "loader!pb", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!pb", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString82;

	@OriginalMember(owner = "loader!pb", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString84;

	@OriginalMember(owner = "loader!pb", name = "u", descriptor = "Ljava/lang/String;")
	private static String aString85;

	@OriginalMember(owner = "loader!pb", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString86;

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString87;

	@OriginalMember(owner = "loader!pb", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString88;

	@OriginalMember(owner = "loader!pb", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!pb", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!pb", name = "f", descriptor = "I")
	private static final int anInt7799 = 1;

	@OriginalMember(owner = "loader!pb", name = "h", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!pb", name = "w", descriptor = "J")
	private static volatile long aLong403 = 0L;

	@OriginalMember(owner = "loader!pb", name = "A", descriptor = "Lloader!nc;")
	private Interface15 anInterface15_1;

	@OriginalMember(owner = "loader!pb", name = "r", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!pb", name = "m", descriptor = "Lloader!rh;")
	private Class280 aClass280_1 = null;

	@OriginalMember(owner = "loader!pb", name = "d", descriptor = "Lloader!rh;")
	private Class280 aClass280_2 = null;

	@OriginalMember(owner = "loader!pb", name = "c", descriptor = "Lloader!rh;")
	private Class280 aClass280_3 = null;

	@OriginalMember(owner = "loader!pb", name = "z", descriptor = "Lloader!jl;")
	private Class278 aClass278_3 = null;

	@OriginalMember(owner = "loader!pb", name = "i", descriptor = "Z")
	private boolean aBoolean525 = false;

	@OriginalMember(owner = "loader!pb", name = "p", descriptor = "Lloader!jl;")
	private Class278 aClass278_2 = null;

	@OriginalMember(owner = "loader!pb", name = "l", descriptor = "Ljava/lang/String;")
	private final String aString83;

	@OriginalMember(owner = "loader!pb", name = "j", descriptor = "I")
	private final int anInt7798;

	@OriginalMember(owner = "loader!pb", name = "b", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!pb", name = "k", descriptor = "[Lloader!rh;")
	private final Class280[] aClass280Array1;

	@OriginalMember(owner = "loader!pb", name = "s", descriptor = "Lloader!c;")
	private Class275 aClass275_1;

	@OriginalMember(owner = "loader!pb", name = "v", descriptor = "Lloader!b;")
	private Class274 aClass274_1;

	@OriginalMember(owner = "loader!pb", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Lloader!rh;")
	private static Class280 method6344(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(19) String local19;
		if (arg0 == 33) {
			local19 = "jagex_" + arg2 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg0 == 34) {
			local19 = "jagex_" + arg2 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local19 = "jagex_" + arg2 + "_preferences" + arg1 + ".dat";
		}
		@Pc(91) String[] local91 = new String[] { "c:/rscache/", "/rscache/", aString85, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			@Pc(105) String local105 = local91[local93];
			if (local105.length() <= 0 || (new File(local105)).exists()) {
				try {
					return new Class280(new File(local105, local19), "rw", 10000L);
				} catch (@Pc(129) Exception local129) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	private static File method6352(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString85, "/tmp/", "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(83) int local83 = 0; local83 < local76.length; local83++) {
				for (@Pc(93) int local93 = 0; local93 < local51.length; local93++) {
					@Pc(131) String local131 = local51[local93] + local76[local83] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(133) RandomAccessFile local133 = null;
					try {
						@Pc(138) File local138 = new File(local131);
						if (local78 != 0 || local138.exists()) {
							@Pc(151) String local151 = local51[local93];
							if (local78 != 1 || local151.length() <= 0 || (new File(local151)).exists()) {
								(new File(local51[local93] + local76[local83])).mkdir();
								if (arg0 != null) {
									(new File(local51[local93] + local76[local83] + "/" + arg0)).mkdir();
								}
								local133 = new RandomAccessFile(local138, "rw");
								@Pc(220) int local220 = local133.read();
								local133.seek(0L);
								local133.write(local220);
								local133.seek(0L);
								local133.close();
								aHashtable4.put(arg1, local138);
								return local138;
							}
						}
					} catch (@Pc(239) Exception local239) {
						try {
							if (local133 != null) {
								local133.close();
							}
						} catch (@Pc(248) Exception local248) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!pb", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class279(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString88 = "Unknown";
		aString87 = "1.1";
		this.aString83 = arg2;
		this.anInt7798 = arg1;
		this.anApplet3 = arg0;
		try {
			aString88 = System.getProperty("java.vendor");
			aString87 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString84 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString84 = "Unknown";
		}
		aString86 = aString84.toLowerCase();
		try {
			aString81 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString81 = "";
		}
		try {
			aString82 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString82 = "";
		}
		try {
			aString85 = System.getProperty("user.home");
			if (aString85 != null) {
				aString85 = aString85 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString85 == null) {
			aString85 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass280_3 = new Class280(method6352(null, "random.dat", this.anInt7798), "rw", 25L);
		this.aClass280_2 = new Class280(this.method6336("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass280_1 = new Class280(this.method6336("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass280Array1 = new Class280[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.aClass280Array1[local192] = new Class280(this.method6336("main_file_cache.idx" + local192), "rw", 1048576L);
		}
		try {
			this.aClass275_1 = new Class275();
		} catch (@Pc(228) Throwable local228) {
		}
		try {
			this.aClass274_1 = new Class274();
		} catch (@Pc(235) Throwable local235) {
		}
		@Pc(238) ThreadGroup local238 = Thread.currentThread().getThreadGroup();
		for (@Pc(241) ThreadGroup local241 = local238.getParent(); local241 != null; local241 = local241.getParent()) {
			local238 = local241;
		}
		@Pc(253) Thread[] local253 = new Thread[1000];
		local238.enumerate(local253);
		for (@Pc(259) int local259 = 0; local259 < local253.length; local259++) {
			if (local253[local259] != null && local253[local259].getName().startsWith("AWT")) {
				local253[local259].setPriority(1);
			}
		}
		this.aBoolean525 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(B)Z")
	private boolean method6330() {
		return this.aClass275_1 != null;
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!jl;")
	private Class278 method6331(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg1 == 0 ? this.method6347(arg0, 0, arg2, (byte) -31, 1) : (Class278) null;
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(ILjava/awt/Component;IB[ILjava/awt/Point;)Lloader!jl;")
	private Class278 method6332(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Point arg5) {
		return arg3 == 113 ? this.method6347(new Object[] { arg1, arg4, arg5 }, arg2, arg0, (byte) -40, 17) : (Class278) null;
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(ILjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lloader!jl;")
	private Class278 method6333(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) String arg3) {
		if (arg0 != 0) {
			aString81 = null;
		}
		return this.method6347(new Object[] { arg1, arg3, arg2 }, 0, 0, (byte) -49, 8);
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(BLjava/lang/String;)[B")
	private byte[] method6334(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class278 local7 = this.method6356(21, arg1, 0, 0, (byte) 46);
		return arg0 == -10 ? (byte[]) local7.anObject22 : (byte[]) null;
	}

	@OriginalMember(owner = "loader!pb", name = "b", descriptor = "(Z)Lloader!nc;")
	private Interface15 method6335(@OriginalArg(0) boolean arg0) {
		return arg0 ? (Interface15) null : this.anInterface15_1;
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method6336(@OriginalArg(1) String arg0) {
		return method6352(this.aString83, arg0, this.anInt7798);
	}

	@OriginalMember(owner = "loader!pb", name = "b", descriptor = "(B)Lloader!jl;")
	private Class278 method6337(@OriginalArg(0) byte arg0) {
		return arg0 == 36 ? this.method6347(null, 0, 0, (byte) -62, 5) : (Class278) null;
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lloader!jl;")
	private Class278 method6338(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 < 74) {
			method6352(null, null, -123);
		}
		return this.method6347(arg0, 0, 0, (byte) -123, 19);
	}

	@OriginalMember(owner = "loader!pb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class278 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean525) {
						return;
					}
					if (this.aClass278_3 != null) {
						local18 = this.aClass278_3;
						this.aClass278_3 = this.aClass278_3.aClass278_1;
						if (this.aClass278_3 == null) {
							this.aClass278_2 = null;
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
				@Pc(47) int local47 = local18.anInt7793;
				if (local47 == 1) {
					if (Class281.method6366() < aLong403) {
						throw new IOException();
					}
					local18.anObject22 = new Socket(InetAddress.getByName((String) local18.anObject23), local18.anInt7791);
				} else if (local47 == 2) {
					@Pc(87) Thread local87 = new Thread((Runnable) local18.anObject23);
					local87.setDaemon(true);
					local87.start();
					local87.setPriority(local18.anInt7791);
					local18.anObject22 = local87;
				} else if (local47 == 4) {
					if (Class281.method6366() < aLong403) {
						throw new IOException();
					}
					local18.anObject22 = new DataInputStream(((URL) local18.anObject23).openStream());
				} else {
					@Pc(428) Object[] local428;
					if (local47 == 8) {
						local428 = (Object[]) local18.anObject23;
						if (((Class) local428[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject22 = ((Class) local428[0]).getDeclaredMethod((String) local428[1], (Class[]) local428[2]);
					} else if (local47 == 9) {
						local428 = (Object[]) local18.anObject23;
						if (((Class) local428[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject22 = ((Class) local428[0]).getDeclaredField((String) local428[1]);
					} else if (local47 == 18) {
						@Pc(662) Clipboard local662 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local18.anObject22 = local662.getContents(null);
					} else if (local47 == 19) {
						@Pc(651) Transferable local651 = (Transferable) local18.anObject23;
						@Pc(654) Clipboard local654 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local654.setContents(local651, null);
					} else {
						@Pc(361) String local361;
						if (local47 == 3) {
							if (aLong403 > Class281.method6366()) {
								throw new IOException();
							}
							local361 = (local18.anInt7791 >> 24 & 0xFF) + "." + (local18.anInt7791 >> 16 & 0xFF) + "." + (local18.anInt7791 >> 8 & 0xFF) + "." + (local18.anInt7791 & 0xFF);
							local18.anObject22 = InetAddress.getByName(local361).getHostName();
						} else if (local47 == 21) {
							if (aLong403 > Class281.method6366()) {
								throw new IOException();
							}
							local18.anObject22 = InetAddress.getByName((String) local18.anObject23).getAddress();
						} else if (local47 == 5) {
							local18.anObject22 = this.aClass275_1.method6307();
						} else if (local47 == 6) {
							@Pc(555) Frame local555 = new Frame("Jagex Full Screen");
							local18.anObject22 = local555;
							local555.setResizable(false);
							this.aClass275_1.method6309(local18.anInt7792 & 0xFFFF, local18.anInt7791 >>> 16, local18.anInt7791 & 0xFFFF, local18.anInt7792 >> 16, local555);
						} else if (local47 == 7) {
							this.aClass275_1.method6308();
						} else {
							@Pc(377) int local377;
							if (local47 == 11) {
								@Pc(482) Field local482 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local482.setAccessible(true);
								@Pc(493) Vector local493 = (Vector) local482.get(((Class) local18.anObject23).getClassLoader());
								for (local377 = 0; local377 < local493.size(); local377++) {
									@Pc(507) Object local507 = local493.elementAt(local377);
									@Pc(514) Method local514 = local507.getClass().getDeclaredMethod("finalize");
									local514.setAccessible(true);
									local514.invoke(local507);
									local514.setAccessible(false);
									@Pc(531) Field local531 = local507.getClass().getDeclaredField("handle");
									local531.setAccessible(true);
									local531.set(local507, Integer.valueOf(0));
									local531.setAccessible(false);
								}
								local482.setAccessible(false);
							} else {
								@Pc(214) Class280 local214;
								if (local47 == 12) {
									local214 = method6344(this.anInt7798, (String) local18.anObject23, this.aString83);
									local18.anObject22 = local214;
								} else if (local47 == 13) {
									local214 = method6344(this.anInt7798, (String) local18.anObject23, "");
									local18.anObject22 = local214;
								} else if (local47 == 14) {
									@Pc(453) int local453 = local18.anInt7791;
									@Pc(456) int local456 = local18.anInt7792;
									this.aClass274_1.method6306(local453, local456);
								} else if (local47 == 15) {
									@Pc(236) boolean local236 = local18.anInt7791 != 0;
									@Pc(240) Component local240 = (Component) local18.anObject23;
									this.aClass274_1.method6305(local240, local236);
								} else if (local47 == 17) {
									local428 = (Object[]) local18.anObject23;
									this.aClass274_1.method6304((Point) local428[2], local18.anInt7791, (int[]) local428[1], (Component) local428[0], local18.anInt7792);
								} else if (local47 == 16) {
									try {
										if (!aString86.startsWith("win")) {
											throw new Exception();
										}
										local361 = (String) local18.anObject23;
										if (!local361.startsWith("http://") && !local361.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(375) String local375 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local377 = 0; local377 < local361.length(); local377++) {
											if (local375.indexOf(local361.charAt(local377)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local361 + "\"");
										local18.anObject22 = null;
									} catch (@Pc(418) Exception local418) {
										local18.anObject22 = local418;
										throw local418;
									}
								} else if (local47 == 20) {
									try {
										@Pc(271) Class[] local271 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										@Pc(273) Runtime local273 = Runtime.getRuntime();
										@Pc(279) Method local279 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local271);
										local279.setAccessible(true);
										if (aString86.startsWith("win")) {
											if (aString81.startsWith("amd64") || aString81.startsWith("x86_64")) {
												local279.invoke(local273, local18.anObject23, this.method6336("jagmisc64.dll").toString());
											} else {
												local279.invoke(local273, local18.anObject23, this.method6336("jagmisc.dll").toString());
											}
										}
										local279.setAccessible(false);
									} catch (@Pc(339) Throwable local339) {
										local18.anObject22 = local339;
									}
								} else {
									throw new Exception("");
								}
							}
						}
					}
				}
				local18.anInt7790 = 1;
			} catch (@Pc(733) ThreadDeath local733) {
				throw local733;
			} catch (@Pc(736) Throwable local736) {
				local18.anInt7790 = 2;
			}
			synchronized (local18) {
				local18.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(I)Lloader!jl;")
	private Class278 method6339(@OriginalArg(0) int arg0) {
		return arg0 == -32693 ? this.method6347(null, 0, 0, (byte) -107, 18) : (Class278) null;
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(II)Lloader!jl;")
	private Class278 method6340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != 31697) {
			this.method6347(null, -33, 105, (byte) -36, -11);
		}
		return this.method6347(null, 0, arg1, (byte) -19, 3);
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lloader!jl;")
	private Class278 method6341(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg0.getLocationOnScreen();
		if (arg2 != 117) {
			this.method6359(103, true, null);
		}
		return this.method6347(null, local2.y + arg3, arg1 - -local2.x, (byte) -75, 14);
	}

	@OriginalMember(owner = "loader!pb", name = "b", descriptor = "(I)V")
	private void method6342(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean525 = true;
			this.notifyAll();
		}
		try {
			if (arg0 <= 105) {
				return;
			}
			this.aThread6.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass280_2 != null) {
			try {
				this.aClass280_2.method6364();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass280_1 != null) {
			try {
				this.aClass280_1.method6364();
			} catch (@Pc(45) IOException local45) {
			}
		}
		if (this.aClass280Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass280Array1.length; local50++) {
				if (this.aClass280Array1[local50] != null) {
					try {
						this.aClass280Array1[local50].method6364();
					} catch (@Pc(74) IOException local74) {
					}
				}
			}
		}
		if (this.aClass280_3 != null) {
			try {
				this.aClass280_3.method6364();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lloader!jl;")
	private Class278 method6343(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		return arg0 <= 26 ? (Class278) null : this.method6347(new Object[] { arg1, arg2 }, 0, 0, (byte) -61, 9);
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(ILjava/net/URL;)Lloader!jl;")
	private Class278 method6345(@OriginalArg(0) int arg0, @OriginalArg(1) URL arg1) {
		if (arg0 < 81) {
			this.aClass280_1 = null;
		}
		return this.method6347(arg1, 0, 0, (byte) -84, 4);
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!jl;")
	private Class278 method6346(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 <= 67) {
			aString87 = null;
		}
		return this.method6347(arg0, 0, 0, (byte) -89, 16);
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(Ljava/lang/Object;IIBI)Lloader!jl;")
	private Class278 method6347(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class278 local3 = new Class278();
		local3.anInt7793 = arg4;
		local3.anInt7792 = arg1;
		local3.anObject23 = arg0;
		local3.anInt7791 = arg2;
		if (arg3 > -15) {
			this.anEventQueue2 = null;
		}
		synchronized (this) {
			if (this.aClass278_2 == null) {
				this.aClass278_2 = this.aClass278_3 = local3;
			} else {
				this.aClass278_2.aClass278_1 = local3;
				this.aClass278_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(Z)V")
	private void method6348(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			aLong403 = Class281.method6366() + 5000L;
		}
	}

	@OriginalMember(owner = "loader!pb", name = "b", descriptor = "(BLjava/lang/Class;)Lloader!jl;")
	private Class278 method6349(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		return arg0 >= -114 ? (Class278) null : this.method6347(arg1, 0, 0, (byte) -70, 11);
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(Ljava/lang/Class;I)V")
	private void method6350(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		if (arg1 >= -2) {
			this.method6339(112);
		}
		@Pc(32) Method local32 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(43) Method local43;
		if (!aString86.startsWith("mac")) {
			local43 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local32.invoke(local43, Boolean.TRUE);
			local43.invoke(local14, arg0, "jawt");
			local32.invoke(local43, Boolean.FALSE);
		}
		local43 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local32.invoke(local43, Boolean.TRUE);
		if (!aString86.startsWith("win")) {
			throw new Exception();
		}
		local43.invoke(local14, arg0, this.method6336("sw3d.dll").toString());
		local32.invoke(local43, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!jl;")
	private Class278 method6351(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != -106) {
			this.anEventQueue2 = null;
		}
		return this.method6347(arg1, 0, 0, (byte) -95, 20);
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(ZBLjava/awt/Component;)Lloader!jl;")
	private Class278 method6353(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Component arg2) {
		if (arg1 != -62) {
			this.aClass275_1 = null;
		}
		return this.method6347(arg2, 0, arg0 ? 1 : 0, (byte) -73, 15);
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(IIIII)Lloader!jl;")
	private Class278 method6354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg1 == -653598992 ? this.method6347(null, (arg4 << 16) + arg3, (arg2 << 16) + arg0, (byte) -107, 6) : (Class278) null;
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!jl;")
	private Class278 method6355(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 28877) {
			this.aClass280_3 = null;
		}
		return this.method6347(arg0, 0, 0, (byte) -115, 7);
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lloader!jl;")
	private Class278 method6356(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(3) Class278 local3 = new Class278();
		synchronized (local3) {
			local3.anInt7793 = arg0;
			local3.anInt7791 = arg3;
			local3.anObject23 = arg1;
			local3.anInt7792 = arg2;
			synchronized (this) {
				if (this.aClass278_2 == null) {
					this.aClass278_2 = this.aClass278_3 = local3;
				} else {
					this.aClass278_2.aClass278_1 = local3;
					this.aClass278_2 = local3;
				}
				this.notify();
				if (arg4 != 46) {
					this.method6345(45, null);
				}
			}
			try {
				local3.wait();
			} catch (@Pc(63) InterruptedException local63) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!pb", name = "b", descriptor = "(BLjava/lang/String;)Lloader!jl;")
	private Class278 method6357(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		return arg0 >= -124 ? (Class278) null : this.method6347(arg1, 0, 0, (byte) -121, 21);
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lloader!jl;")
	private Class278 method6358(@OriginalArg(0) Runnable arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 80) {
			this.method6346(null, (byte) -89);
		}
		return this.method6347(arg0, 0, arg2, (byte) -81, 2);
	}

	@OriginalMember(owner = "loader!pb", name = "a", descriptor = "(IZLjava/lang/String;)Lloader!jl;")
	private Class278 method6359(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		if (arg0 == 19) {
			return arg1 ? this.method6347(arg2, 0, 0, (byte) -89, 12) : this.method6347(arg2, 0, 0, (byte) -30, 13);
		} else {
			return (Class278) null;
		}
	}
}
