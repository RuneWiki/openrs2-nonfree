import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
public final class Class205 {

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "()V")
	public Class205() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(26) GraphicsDevice local26 = local14[local18];
				if (local26 != null && local26.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local26;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(B)[I")
	public int[] method4708() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(IIBILjava/awt/Frame;I)V")
	public void method4709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg3.setUndecorated(true);
		arg3.enableInputMethods(false);
		this.method4711(arg3);
		if (arg0 == 0) {
			@Pc(30) int local30 = this.aDisplayMode1.getRefreshRate();
			@Pc(34) DisplayMode[] local34 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < local34.length; local38++) {
				if (arg2 == local34[local38].getWidth() && local34[local38].getHeight() == arg1 && local34[local38].getBitDepth() == arg4) {
					@Pc(65) int local65 = local34[local38].getRefreshRate();
					if (!local36 || Math.abs(local65 - local30) < Math.abs(arg0 - local30)) {
						arg0 = local65;
						local36 = true;
					}
				}
			}
			if (!local36) {
				arg0 = local30;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg2, arg1, arg4, arg0));
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Z)V")
	public void method4710() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method4711(null);
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method4711(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(13) Field local13 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local13.setAccessible(true);
			@Pc(23) boolean local23 = (Boolean) local13.get(this.aGraphicsDevice1);
			if (local23) {
				local13.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(35) Throwable local35) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(62) Field local62 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local62.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(69) Throwable local69) {
				}
			}
		}
	}
}
