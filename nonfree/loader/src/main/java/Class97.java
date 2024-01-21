import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rh")
public final class Class97 implements Runnable {

	@OriginalMember(owner = "loader!rh", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!rh", name = "e", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!rh", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!rh", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!rh", name = "j", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!rh", name = "f", descriptor = "I")
	private static final int anInt4196 = 1;

	@OriginalMember(owner = "loader!rh", name = "l", descriptor = "Lloader!r;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!rh", name = "k", descriptor = "[Lloader!kh;")
	private Class96[] aClass96Array1;

	@OriginalMember(owner = "loader!rh", name = "g", descriptor = "Lloader!kh;")
	private Class96 aClass96_1 = null;

	@OriginalMember(owner = "loader!rh", name = "c", descriptor = "Lloader!td;")
	private Class98 aClass98_1 = null;

	@OriginalMember(owner = "loader!rh", name = "b", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!rh", name = "s", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!rh", name = "o", descriptor = "Ljava/io/File;")
	private File aFile6 = null;

	@OriginalMember(owner = "loader!rh", name = "q", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "loader!rh", name = "n", descriptor = "Lloader!kh;")
	private Class96 aClass96_2 = null;

	@OriginalMember(owner = "loader!rh", name = "d", descriptor = "Lloader!td;")
	private Class98 aClass98_2 = null;

	@OriginalMember(owner = "loader!rh", name = "m", descriptor = "Lloader!kh;")
	private Class96 aClass96_3 = null;

	@OriginalMember(owner = "loader!rh", name = "a", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!rh", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!rh", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class97(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet3 = arg1;
		aString7 = "1.1";
		aString8 = "Unknown";
		try {
			aString8 = System.getProperty("java.vendor");
			aString7 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString9 = System.getProperty("user.home");
			if (aString9 != null) {
				aString9 = aString9 + "/";
			}
		} catch (@Pc(61) Exception local61) {
		}
		if (aString9 == null) {
			aString9 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(72) Throwable local72) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(100) Exception local100) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(127) Exception local127) {
		}
		this.method3223(arg2, arg3, arg4);
		this.aBoolean186 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!rh", name = "a", descriptor = "(IBLjava/lang/String;I)V")
	private void method3223(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(77) int local77 = 0; local77 < local70.length; local77++) {
				for (@Pc(87) int local87 = 0; local87 < local34.length; local87++) {
					try {
						@Pc(99) String local99 = local34[local87];
						if (local99.length() > 0 && !(new File(local99)).exists()) {
							continue;
						}
						@Pc(127) File local127 = new File(local99 + local70[local77]);
						@Pc(136) boolean local136;
						if (local72 == 1 && !local127.exists()) {
							local136 = local127.mkdir();
							if (!local136) {
								continue;
							}
						}
						@Pc(150) File local150;
						if (this.aClass96_3 == null) {
							try {
								local150 = new File(local127, "random.dat");
								if (local72 == 1 || local150.exists()) {
									this.aClass96_3 = new Class96(local150, "rw", 25L);
								}
							} catch (@Pc(167) Exception local167) {
								this.aClass96_3 = null;
							}
						}
						if (this.aFile6 == null) {
							@Pc(222) int local222;
							try {
								local127 = new File(local127, arg1);
								if (local72 == 1 && !local127.exists()) {
									local136 = local127.mkdir();
									if (!local136) {
										continue;
									}
								}
								local150 = new File(local127, "main_file_cache.dat2");
								if (local72 == 0 && !local150.exists()) {
									continue;
								}
								this.aClass96_2 = new Class96(local150, "rw", 104857600L);
								this.aClass96Array1 = new Class96[23];
								for (local222 = 0; local222 < 23; local222++) {
									this.aClass96Array1[local222] = new Class96(new File(local127, "main_file_cache.idx" + local222), "rw", 1048576L);
								}
								this.aClass96_1 = new Class96(new File(local127, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile6 = local127;
							} catch (@Pc(272) Exception local272) {
								try {
									this.aClass96_2.method3203();
									for (local222 = 0; local222 < 23; local222++) {
										this.aClass96Array1[local222].method3203();
									}
									this.aClass96_1.method3203();
								} catch (@Pc(299) Exception local299) {
								}
								this.aClass96_2 = this.aClass96_1 = null;
								this.aClass96Array1 = null;
								this.aFile5 = this.aFile6 = null;
							}
						}
					} catch (@Pc(316) Exception local316) {
					}
					if (this.aClass96_3 != null && this.aFile6 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile6 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!rh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class98 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean186) {
						return;
					}
					if (this.aClass98_2 != null) {
						local16 = this.aClass98_2;
						this.aClass98_2 = this.aClass98_2.aClass98_3;
						if (this.aClass98_2 == null) {
							this.aClass98_1 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt4198;
				if (local45 == 1) {
					local16.anObject6 = new Socket(InetAddress.getByName((String) local16.anObject5), local16.anInt4199);
				} else if (local45 == 2) {
					@Pc(188) Thread local188 = new Thread((Runnable) local16.anObject5);
					local188.setDaemon(true);
					local188.start();
					local188.setPriority(local16.anInt4199);
					local16.anObject6 = local188;
				} else if (local45 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject5).openStream());
				} else {
					@Pc(127) Object[] local127;
					if (local45 == 8) {
						local127 = (Object[]) local16.anObject5;
						if (((Class) local127[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local127[0]).getDeclaredMethod((String) local127[1], (Class[]) local127[2]);
					} else if (local45 == 9) {
						local127 = (Object[]) local16.anObject5;
						if (((Class) local127[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local127[0]).getDeclaredField((String) local127[1]);
					} else if (local45 == 3) {
						@Pc(116) String local116 = (local16.anInt4199 >> 24 & 0xFF) + "." + (local16.anInt4199 >> 16 & 0xFF) + "." + (local16.anInt4199 >> 8 & 0xFF) + "." + (local16.anInt4199 & 0xFF);
						local16.anObject6 = InetAddress.getByName(local116).getHostName();
					}
				}
				local16.anInt4197 = 1;
			} catch (@Pc(217) ThreadDeath local217) {
				throw local217;
			} catch (@Pc(220) Throwable local220) {
				local16.anInt4197 = 2;
			}
		}
	}
}
