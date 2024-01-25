import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class107 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!vg;[Lclient!lf;)V")
	public dxVertexLayout(@OriginalArg(0) Class90_Sub3_Sub2 arg0, @OriginalArg(1) Class185[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aCa1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class185 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local27 < local25.method4408(); local27++) {
				@Pc(37) Class217 local37 = local25.method4411(local27);
				@Pc(44) byte local44;
				@Pc(46) byte local46;
				@Pc(42) int local42;
				if (local37 == Static347.aClass217_1) {
					local42 = 0;
					local44 = 2;
					local46 = 0;
				} else if (local37 == Static347.aClass217_2) {
					local46 = 3;
					local42 = 0;
					local44 = 2;
				} else if (Static347.aClass217_3 == local37) {
					local44 = 4;
					local46 = 10;
					local42 = 0;
				} else if (local37 == Static347.aClass217_4) {
					local42 = local9++;
					local46 = 5;
					local44 = 0;
				} else if (local37 == Static347.aClass217_5) {
					local44 = 1;
					local46 = 5;
					local42 = local9++;
				} else if (local37 == Static347.aClass217_6) {
					local46 = 5;
					local44 = 2;
					local42 = local9++;
				} else {
					local46 = 5;
					local42 = local9++;
					local44 = 3;
				}
				local7.addElement(local11, local44, 0, local46, local42, local21);
				local21 += local37.anInt6533;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
