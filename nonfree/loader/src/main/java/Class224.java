import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!g")
public final class Class224 {

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "()V")
	public Class224() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(27) GraphicsDevice local27 = local15[local19];
				if (local27 != null && local27.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local27;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(I)V")
	public void method5848() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5849(null);
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	private void method5849(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
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

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "(I)[I")
	public int[] method5850() {
		@Pc(10) DisplayMode[] local10 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(16) int[] local16 = new int[local10.length << 2];
		for (@Pc(18) int local18 = 0; local18 < local10.length; local18++) {
			local16[local18 << 2] = local10[local18].getWidth();
			local16[(local18 << 2) + 1] = local10[local18].getHeight();
			local16[(local18 << 2) + 2] = local10[local18].getBitDepth();
			local16[(local18 << 2) + 3] = local10[local18].getRefreshRate();
		}
		return local16;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
	public void method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg3.setUndecorated(true);
		arg3.enableInputMethods(false);
		this.method5849(arg3);
		if (arg0 == 0) {
			@Pc(34) int local34 = this.aDisplayMode1.getRefreshRate();
			@Pc(38) DisplayMode[] local38 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(40) boolean local40 = false;
			for (@Pc(42) int local42 = 0; local42 < local38.length; local42++) {
				if (local38[local42].getWidth() == arg1 && local38[local42].getHeight() == arg2 && arg4 == local38[local42].getBitDepth()) {
					@Pc(73) int local73 = local38[local42].getRefreshRate();
					if (!local40 || Math.abs(local73 - local34) < Math.abs(arg0 - local34)) {
						local40 = true;
						arg0 = local73;
					}
				}
			}
			if (!local40) {
				arg0 = local34;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg4, arg0));
	}
}
