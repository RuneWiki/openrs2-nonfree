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

@OriginalClass("loader!gg")
public final class Class94 implements Runnable {

	@OriginalMember(owner = "loader!gg", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!gg", name = "m", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!gg", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "loader!gg", name = "i", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!gg", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!gg", name = "n", descriptor = "I")
	private static final int anInt4582 = 1;

	@OriginalMember(owner = "loader!gg", name = "s", descriptor = "[Lloader!tc;")
	private Class95[] aClass95Array1;

	@OriginalMember(owner = "loader!gg", name = "o", descriptor = "Lloader!sh;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!gg", name = "f", descriptor = "Lloader!tc;")
	private Class95 aClass95_2 = null;

	@OriginalMember(owner = "loader!gg", name = "j", descriptor = "Lloader!tc;")
	private Class95 aClass95_1 = null;

	@OriginalMember(owner = "loader!gg", name = "d", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!gg", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!gg", name = "a", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "loader!gg", name = "l", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!gg", name = "g", descriptor = "Lloader!ea;")
	private Class93 aClass93_3 = null;

	@OriginalMember(owner = "loader!gg", name = "q", descriptor = "Lloader!tc;")
	private Class95 aClass95_3 = null;

	@OriginalMember(owner = "loader!gg", name = "e", descriptor = "Lloader!ea;")
	private Class93 aClass93_2 = null;

	@OriginalMember(owner = "loader!gg", name = "c", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!gg", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!gg", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class94(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString7 = "Unknown";
		aString9 = "1.1";
		this.anApplet2 = arg1;
		try {
			aString7 = System.getProperty("java.vendor");
			aString9 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString8 = System.getProperty("user.home");
			if (aString8 != null) {
				aString8 = aString8 + "/";
			}
		} catch (@Pc(60) Exception local60) {
		}
		if (aString8 == null) {
			aString8 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(72) Throwable local72) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(100) Exception local100) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(127) Exception local127) {
		}
		this.method3534(arg4, arg2, arg3);
		this.aBoolean179 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!gg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class93 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean179) {
						return;
					}
					if (this.aClass93_3 != null) {
						local16 = this.aClass93_3;
						this.aClass93_3 = this.aClass93_3.aClass93_1;
						if (this.aClass93_3 == null) {
							this.aClass93_2 = null;
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
				@Pc(45) int local45 = local16.anInt4580;
				if (local45 == 1) {
					local16.anObject6 = new Socket(InetAddress.getByName((String) local16.anObject5), local16.anInt4579);
				} else if (local45 == 2) {
					@Pc(192) Thread local192 = new Thread((Runnable) local16.anObject5);
					local192.setDaemon(true);
					local192.start();
					local192.setPriority(local16.anInt4579);
					local16.anObject6 = local192;
				} else if (local45 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject5).openStream());
				} else {
					@Pc(81) Object[] local81;
					if (local45 == 8) {
						local81 = (Object[]) local16.anObject5;
						if (((Class) local81[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local81[0]).getDeclaredMethod((String) local81[1], (Class[]) local81[2]);
					} else if (local45 == 9) {
						local81 = (Object[]) local16.anObject5;
						if (((Class) local81[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local81[0]).getDeclaredField((String) local81[1]);
					} else if (local45 == 3) {
						@Pc(147) String local147 = (local16.anInt4579 >> 24 & 0xFF) + "." + (local16.anInt4579 >> 16 & 0xFF) + "." + (local16.anInt4579 >> 8 & 0xFF) + "." + (local16.anInt4579 & 0xFF);
						local16.anObject6 = InetAddress.getByName(local147).getHostName();
					}
				}
				local16.anInt4581 = 1;
			} catch (@Pc(221) ThreadDeath local221) {
				throw local221;
			} catch (@Pc(224) Throwable local224) {
				local16.anInt4581 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!gg", name = "a", descriptor = "(IIILjava/lang/String;)V")
	private void method3534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(35) String[] local35 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		@Pc(70) String[] local70 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString8, "/tmp/", "" };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(86) int local86 = 0; local86 < local35.length; local86++) {
				for (@Pc(96) int local96 = 0; local96 < local70.length; local96++) {
					try {
						@Pc(104) String local104 = local70[local96];
						if (local104.length() > 0 && !(new File(local104)).exists()) {
							continue;
						}
						@Pc(128) File local128 = new File(local104 + local35[local86]);
						@Pc(140) boolean local140;
						if (local79 == 1 && !local128.exists()) {
							local140 = local128.mkdir();
							if (!local140) {
								continue;
							}
						}
						@Pc(154) File local154;
						if (this.aClass95_1 == null) {
							try {
								local154 = new File(local128, "random.dat");
								if (local79 == 1 || local154.exists()) {
									this.aClass95_1 = new Class95(local154, "rw", 25L);
								}
							} catch (@Pc(172) Exception local172) {
								this.aClass95_1 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(227) int local227;
							try {
								local128 = new File(local128, arg2);
								if (local79 == 1 && !local128.exists()) {
									local140 = local128.mkdir();
									if (!local140) {
										continue;
									}
								}
								local154 = new File(local128, "main_file_cache.dat2");
								if (local79 == 0 && !local154.exists()) {
									continue;
								}
								this.aClass95_3 = new Class95(local154, "rw", 104857600L);
								this.aClass95Array1 = new Class95[16];
								for (local227 = 0; local227 < 16; local227++) {
									this.aClass95Array1[local227] = new Class95(new File(local128, "main_file_cache.idx" + local227), "rw", 1048576L);
								}
								this.aClass95_2 = new Class95(new File(local128, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local128;
							} catch (@Pc(277) Exception local277) {
								try {
									this.aClass95_3.method3555();
									for (local227 = 0; local227 < 16; local227++) {
										this.aClass95Array1[local227].method3555();
									}
									this.aClass95_2.method3555();
								} catch (@Pc(304) Exception local304) {
								}
								this.aFile4 = this.aFile5 = null;
								this.aClass95Array1 = null;
								this.aClass95_3 = this.aClass95_2 = null;
							}
						}
					} catch (@Pc(321) Exception local321) {
					}
					if (this.aClass95_1 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}
}
